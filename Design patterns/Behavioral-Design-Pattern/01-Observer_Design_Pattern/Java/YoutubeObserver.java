import java.io.*;
import java.util.*;


//Observer interface: Subscriber --> can subscribe via YoutubeNotification or Email Notification
interface Subscriber{
    void update(String message, String name);
}

class YoutubeSubscriber implements Subscriber{
    private String name;

    YoutubeSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String video, String Channelname){
        System.out.println(this.name + ": " + video + " Video has been uploaded to the channel "+Channelname);
    }
}

class EmailSubscriber implements Subscriber{
    private String emailId;

    EmailSubscriber(String email){
        this.emailId = email;
    }

    @Override
    public void update(String video, String Channelname){
        System.out.println(this.emailId + ": "+ video + " Video has been uploaded to the channel "+Channelname);
    }
}

//This is the Subject interface
interface YoutubeChannel{
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers();
    void uploadNewVideo(String video);
}

//Subject implementation
class YoutubeChannelImpl implements YoutubeChannel{
    private List<Subscriber> subscriberList = new ArrayList<>();
    private String video;
    private String name;

    YoutubeChannelImpl(String name){
        this.name = name;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber); // Add a subscriber to the channel
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber); // Remove a subscriber from the channel
    }

    @Override
    public void notifySubscribers() {
        // Notify all subscribers about the new video
        for (Subscriber subscriber : subscriberList) {
            subscriber.update(video, name); // Call update() for each subscriber
        }
    }

    @Override
    public void uploadNewVideo(String video){
        this.video = video;
        this.notifySubscribers();
    }
}

//This is client code
public class YoutubeObserver{
    public static void main(String args[]){

        Subscriber prathamYt = new YoutubeSubscriber("PrathameshYt");
        Subscriber prathamEmail = new EmailSubscriber("PrathameshEmail");

        YoutubeChannelImpl codingChannel1 = new YoutubeChannelImpl("Coding Channel 1");
        YoutubeChannelImpl codingChannel2 = new YoutubeChannelImpl("Coding Channel 2");

        codingChannel1.addSubscriber(prathamYt);
        codingChannel2.addSubscriber(prathamYt);
        codingChannel1.addSubscriber(prathamEmail);

        codingChannel1.uploadNewVideo("String KMP");
        codingChannel1.uploadNewVideo("Graph Dijkstras");

        codingChannel2.uploadNewVideo("LinkedList");
        codingChannel2.uploadNewVideo("Tree");

        codingChannel1.removeSubscriber(prathamYt);

        codingChannel1.uploadNewVideo("BST/AVL tree");

    }
}