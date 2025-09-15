package service;
import model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class UserService {
	private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }

    public Optional<User> getUserById(String id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public boolean updateUser(String id, String name, String email) {
        Optional<User> userOptional = getUserById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setName(name);
            user.setEmail(email);
            return true;
        }
        return false;
    }

    public boolean deleteUser(String id) {
        return users.removeIf(user -> user.getId().equals(id));
    }
}
