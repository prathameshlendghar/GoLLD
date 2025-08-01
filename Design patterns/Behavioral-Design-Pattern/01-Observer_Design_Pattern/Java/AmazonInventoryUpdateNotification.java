// This was the question discuessed in walmart interview
// It says that we have ecommerce like amazon. Now here we should get notification when the stock of iphone is again available. 
// We have subscribed to the Notifiacations via lets say email, mobile etc


import java.util.*;


//Observer Interface
interface CustomerNotification{
    public void update(String name, Integer quantity);
}

// Email Oberver
class CustomerEmailNotification implements  CustomerNotification{
    
    private String name;

    public CustomerEmailNotification(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String name, Integer quantity){
        System.out.println("Email: "+ this.name + ", the Product [" + name + "] is available at " + quantity);
    }

}

//Whatsapp Observer
class CustomerWhatsappNotification implements  CustomerNotification{
    
    private String name;

    public CustomerWhatsappNotification(String name) {
        this.name = name;
    }

    @Override
    public void update(String name, Integer quantity){
        System.out.println("Whatsapp: "+ this.name + ", the Product [" + name + "] is available at " + quantity);
    }
}

//SMS Observer
class CustomerSMSNotification implements  CustomerNotification{
    String name;

    public CustomerSMSNotification(String name) {
        this.name = name;
    }

    @Override
    public void update(String name, Integer quantity){
        System.out.println("SMS: "+ this.name + ", the Product [" + name + "] is available at " + quantity);
    }
}

//Observable
class AmazonNotificationService{
    List<CustomerNotification> observers = new ArrayList<>();
    private String productName;
    private Integer quantity;

    public void addObserver(CustomerNotification obj){
        observers.add(obj);
    }
    public void removeObserver(CustomerNotification obj){
        observers.remove(obj);
    }

    public void notifyCustomers(){
        for (CustomerNotification observer : observers) {
            observer.update(productName, quantity);
        }
    }

    public void addProduct(String productName, Integer quantity){
        if(quantity > 0){
            this.productName = productName;
            this.quantity = quantity;
            notifyCustomers();
        }
    }

    public void updateProductInventorySize(String productName, Integer quantity){
        if(quantity > 0){
            this.productName = productName;
            this.quantity = quantity;
            notifyCustomers();
        }
    }
}

public class AmazonInventoryUpdateNotification{
    public static void main(String[] args){
        CustomerNotification customer1Email = new CustomerEmailNotification("PrathameshEmail");
        CustomerNotification customer1SMS = new CustomerSMSNotification("PrathameshSMS");
        CustomerNotification customer1Wp = new CustomerEmailNotification("PrathameshWp");

        AmazonNotificationService amazonNotificationService = new AmazonNotificationService();
        amazonNotificationService.addObserver(customer1Email);
        amazonNotificationService.addObserver(customer1SMS);
        amazonNotificationService.addObserver(customer1Wp);

        amazonNotificationService.addObserver(new CustomerSMSNotification("Suraj"));
        amazonNotificationService.addObserver(new CustomerEmailNotification("Niraj"));
        amazonNotificationService.addObserver(new CustomerWhatsappNotification("Rohit"));

        amazonNotificationService.addProduct("Iphone", 10);
        amazonNotificationService.updateProductInventorySize("Iphone", 0);
        amazonNotificationService.addProduct("Samsung", 100);
        
        amazonNotificationService.removeObserver(customer1SMS);

        amazonNotificationService.updateProductInventorySize("Iphone", 10);
        amazonNotificationService.updateProductInventorySize("Iphone", 0);
        amazonNotificationService.updateProductInventorySize("Samsung", 100);

    }
}