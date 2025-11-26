package cleancode.LavaFlow;

public class UserService {

    // Current working method
    public void createUser(String name) {
        System.out.println("Creating user: " + name);
        // some database logic here
    }

    // Old method no longer used
    public void createUserOld(String name, String email) {
        System.out.println("Creating user (old method): " + name + ", " + email);
        // old database logic, never called
    }

    // Another obsolete method
    public void deleteUserOld(int userId) {
        System.out.println("Deleting user with ID: " + userId);
    }
}
