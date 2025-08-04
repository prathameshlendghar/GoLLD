
import java.util.*;

interface Bidder{
    public void placeBid(int price);
    public void receiveBidNotification(int price);
}

class BidderColleague implements Bidder{
    public String name;
    public AuctionMediator mediator;

    public BidderColleague(String name, AuctionMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void placeBid(int price){
        mediator.placeBid(this, price);
    }

    @Override
    public void receiveBidNotification(int price){
        System.out.println("Bidder: " + name + " The latest Bid placed is of amount " + price);
    }
}

interface AuctionMediator{
    public void addBidder(Bidder bidder);
    public void placeBid(Bidder bidder, int price);
}

class ConcreteAuctionMediator implements AuctionMediator{
    List<Bidder> bidders;

    public ConcreteAuctionMediator() {
        bidders = new ArrayList<>();
    }

    public void addBidder(Bidder bidder){
        bidders.add(bidder);
    }
    
    public void placeBid(Bidder bidder, int price){
        for(Bidder person : bidders){
            if(person != bidder){
                person.receiveBidNotification(price);
            }
        }
    }
}

public class OnlineAuctionSystem{
    public static void main(String[] args) {
        AuctionMediator mediator = new ConcreteAuctionMediator();
        BidderColleague prathamesh = new BidderColleague("prathamesh", mediator);
        BidderColleague Pratik = new BidderColleague("Pratik", mediator);
        BidderColleague Rahul = new BidderColleague("Rahul", mediator);
        BidderColleague Ramesh = new BidderColleague("Ramesh", mediator);

        mediator.addBidder(prathamesh);
        mediator.addBidder(Pratik);
        mediator.addBidder(Rahul);
        mediator.addBidder(Ramesh);

        prathamesh.placeBid(5000);

        Rahul.placeBid(9000);

    }
}