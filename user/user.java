package user;

public class User {
    private String name;           // Private field (access via getter/setter)
    protected int age;             // Protected field
    String email;                  // Default (package-private)
    public String role;            // Public field

    // Constructor
    public User(String name, int age, String email, String role) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.role = role;
    }

    // Getter and Setter for private field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to display user info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Role: " + role);
    }
}
