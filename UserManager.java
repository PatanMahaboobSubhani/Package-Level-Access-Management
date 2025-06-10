package manager;

import user.User;

public class UserManager {
    public static void main(String[] args) {
        User user = new User("Subhani", 28, "subhani@example.com", "Admin");

        // Access via public method (private field)
        System.out.println("Name (via getter): " + user.getName());

        // user.age is protected — not accessible from a different package directly
        // System.out.println(user.age); // ❌ Compile error

        // user.email is default (package-private) — not accessible from a different package
        // System.out.println(user.email); // ❌ Compile error

        // user.role is public — accessible
        System.out.println("Role: " + user.role);

        // You can call public methods
        user.displayInfo();
    }
}
