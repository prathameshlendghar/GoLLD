import java.util.*;

// Bidder interface
interface Bidder {
    void placeBid(int price);
    void receiveBidNotification(String bidderName, int price);
    String getName(); // Added to help with notifications
}

// Concrete Bidder (Colleague)
class BidderColleague implements Bidder {
    private final String name;
    private final AuctionMediator mediator;

    public BidderColleague(String name, AuctionMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void placeBid(int price) {
        System.out.println("\n" + name + " is placing a bid of: " + price);
        mediator.placeBid(this, price);
    }

    @Override
    public void receiveBidNotification(String bidderName, int price) {
        System.out.println("Bidder " + name + ": New bid placed by " + bidderName + " for amount " + price);
    }

    @Override
    public String getName() {
        return name;
    }
}

// Mediator interface
interface AuctionMediator {
    void addBidder(Bidder bidder);
    void placeBid(Bidder bidder, int price);
}

// Concrete Mediator
class ConcreteAuctionMediator implements AuctionMediator {
    private final List<Bidder> bidders = new ArrayList<>();
    private int highestBid = 0;
    private String highestBidder = "";

    @Override
    public void addBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(Bidder bidder, int price) {
        if (price > highestBid) {
            highestBid = price;
            highestBidder = bidder.getName();

            for (Bidder person : bidders) {
                if (!person.equals(bidder)) {
                    person.receiveBidNotification(highestBidder, highestBid);
                }
            }
        } else {
            System.out.println("Bid of " + price + " is too low. Current highest bid is " + highestBid + " by " + highestBidder);
        }
    }
}

// Main class
public class OnlineAuctionSystem {
    public static void main(String[] args) {
        AuctionMediator mediator = new ConcreteAuctionMediator();

        BidderColleague prathamesh = new BidderColleague("Prathamesh", mediator);
        BidderColleague pratik = new BidderColleague("Pratik", mediator);
        BidderColleague rahul = new BidderColleague("Rahul", mediator);
        BidderColleague ramesh = new BidderColleague("Ramesh", mediator);

        mediator.addBidder(prathamesh);
        mediator.addBidder(pratik);
        mediator.addBidder(rahul);
        mediator.addBidder(ramesh);

        prathamesh.placeBid(5000);
        rahul.placeBid(9000);
        pratik.placeBid(8500); // Should be rejected
        ramesh.placeBid(12000);
    }
}