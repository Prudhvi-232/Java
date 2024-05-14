
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class userService {
private List<userModel> users = new ArrayList<>();
public List<userModel> getAllUsers() {
return users;
 }
public userModel getUserByUsername(String username) {
for (userModel user : users) {
if (user.getUsername().equals(username)) {
return user;
 }
 }
return null;
 }
public void deleteUserById(String userId) {
users.removeIf(user -> user.getUserId().equals(userId));
 }
}