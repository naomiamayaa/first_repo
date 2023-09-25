public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    // Constructor with parameters
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Default constructor
    public BuddyInfo() {
        // You can set default values here if needed
    }
    public static void main(String[] args) {
        // Create a BuddyInfo object and set its attributes
        BuddyInfo buddyInfo = new BuddyInfo("Homer", "123 Main St", "555-1234");

        // Display a greeting followed by the name using the getter method
        System.out.println("Hello " + buddyInfo.getName());

        // Display other information using getter methods
        System.out.println("Address: " + buddyInfo.getAddress());
        System.out.println("Phone Number: " + buddyInfo.getPhoneNumber());
    }

    // Getter methods for name, address, and phoneNumber
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}

// answer to question 2 /Users/naomiamayalovett/IdeaProjects/SYSC3110/Lab 1/out/production/Lab 1
