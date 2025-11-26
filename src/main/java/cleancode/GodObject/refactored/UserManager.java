package cleancode.GodObject.refactored;

import java.util.ArrayList;
import java.util.List;

class UserManager {
    private List<String> users = new ArrayList<>();

    public void addUser(String user) {
        users.add(user);
    }

    public void removeUser(String user) {
        users.remove(user);
    }

    public List<String> getUsers() {
        return users;
    }
}
