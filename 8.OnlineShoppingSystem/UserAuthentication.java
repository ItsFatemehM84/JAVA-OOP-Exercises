import java.util.HashMap;
import java.util.Map;

public class UserAuthentication {
    private Map<String, String> users;

    public UserAuthentication() {
        this.users = new HashMap<>();
    }

    public void registerUser(String username, String password) {
        users.put(username, password);
        System.out.println("User " + username + " registered successfully.");
    }

    public boolean loginUser(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}
