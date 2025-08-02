// If we want to Switch the payment on the user end dynamically then we can make the payment strategy loosly coupled so that we can switch the one when needed.

interface PaymentStratergy{
    public void pay(Integer amount);
}

class CreditCardPayStratergy implements PaymentStratergy{
    private String cardNum;
    private String expDate;
    private Integer cvv;
    private String name;

    public CreditCardPayStratergy(String cardNum, String expDate, Integer cvv, String name) {
        this.cardNum = cardNum;
        this.expDate = expDate;
        this.cvv = cvv;
        this.name = name;
    }

    public void checkCardDetails(){
        System.out.println("Card Number: " + cardNum);
        System.out.println("Card Expiry: " + expDate);
        System.out.println("Card CVV: " + cvv);
        System.out.println("Card Name: " + name);
    }

    @Override
    public void pay(Integer amount){
        System.out.println("Checking Validity of the card...");
        System.out.println(name + ": Payment of Amount " + amount + " is Successfull via Credit Card");
    }
}

class UpiPayStratergy implements PaymentStratergy{
    public String upiId;
    public String username;

    public UpiPayStratergy(String upiId, String username) {
        this.upiId = upiId;
        this.username = username;
    }

    public void checkCardDetails(){
        System.out.println("UPI ID: " + upiId);
    }

    @Override
    public void pay(Integer amount){
        System.out.println(username + ": Payment of Amount " + amount + " is Successfull via UPI");
    }
}

class DebitCardPayStratergy implements PaymentStratergy{
    private String cardNum;
    private String expDate;
    private Integer cvv;
    private String name;

    public DebitCardPayStratergy(String cardNum, String expDate, Integer cvv, String name) {
        this.cardNum = cardNum;
        this.expDate = expDate;
        this.cvv = cvv;
        this.name = name;
    }

    public void checkCardDetails(){
        System.out.println("Card Number: " + cardNum);
        System.out.println("Card Expiry: " + expDate);
        System.out.println("Card CVV: " + cvv);
        System.out.println("Card Name: " + name);
    }

    @Override
    public void pay(Integer amount){
        System.out.println("Checking Validity of the card...");
        System.out.println(name + ": Payment of Amount " + amount + " is Successfull via Debit Card");
    }
}

class PaymentContext{
    PaymentStratergy paymentStratergy;

    public PaymentContext(PaymentStratergy paymentStratergy) {
        this.paymentStratergy = paymentStratergy;
    }

    public void changePaymentStartergy(PaymentStratergy paymentStratergy){
        this.paymentStratergy = paymentStratergy;
    }

    public void pay(Integer amount){
        paymentStratergy.pay(amount);
    }

}


public class EcommercePayment{
    public static void main(String[] args) {
        PaymentStratergy upiPayment = new UpiPayStratergy("7373737373@apl", "Prathamesh");
        PaymentContext paymentInterface = new PaymentContext(upiPayment);
        paymentInterface.pay(5000);

        PaymentStratergy creditCardPayment = new CreditCardPayStratergy("8080 8080 8080", "12/2025", 222, "Prathamesh");
        paymentInterface.changePaymentStartergy(creditCardPayment);
        paymentInterface.pay(900099);
    }
}