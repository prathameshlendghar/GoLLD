class User {
    // Required fields
    private final String username;
    private final String email;

    // Optional fields
    private final int age;
    private final String phone;
    private final String address;
    private final String usertype;

    // ✅ Private constructor — only Builder can create this
    private User(Builder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
        this.usertype = builder.usertype;    
    }

    //This method is just to print please ignore this
    public void printUser(){
        System.out.println("User name: "+ this.username);
        System.out.println("Email: "+ this.email);
        System.out.println("Age: "+ this.age);
        System.out.println("Phone: "+ this.phone);
        System.out.println("Type: "+ this.usertype);
    }

    // ✅ Static nested Builder class.
    //This has to be nested as 
    public static class Builder {
        // Required fields
        private final String username;
        private final String email;

        // Optional fields with default values
        private int age = 0;
        private String phone = "";
        private String address = "";
        private String usertype = "Customer"; 

        // Builder constructor with required fields
        public Builder(String username, String email) {
            this.username = username;
            this.email = email;
        }

        // Chained setters for optional fields
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCustomerType(String address) {
            this.address = address;
            return this;
        }

        // ✅ build() returns the fully constructed User
        public User build() {
            // Optional: add validation here
            if (username.isEmpty() || email.isEmpty()) {
                throw new IllegalStateException("Username and Email cannot be empty");
            }
            return new User(this);
        }
    }

    // ✅ Getters (no setters to keep object immutable)
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public int getAge() { return age; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
}

public class UserMain{
    public static void main(String[] args){
        User.Builder userBuilder = new User.Builder("prathamesh", "prathameshlendghar78@gmail.com").
            setAge(24).
            setAddress("Lonvala").
            setPhone("7324");

        User customer = userBuilder.build();

        //Can also directly make the object in one line
        
        // User user = new User.Builder("john_doe", "john@example.com")
        //     .setAge(30)
        //     .setPhone("123-456-7890")
        //     .setAddress("123 Main Street")
        //     .build();

        customer.printUser();
    }
}