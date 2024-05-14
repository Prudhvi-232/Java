
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/users")
public class userController {
 @Autowired
private userService userService;
 @GetMapping("/")
public List<userModel> getAllUsers() {
return userService.getAllUsers();
 }
 @GetMapping("/{username}")
public Optional<userModel> getUserByUsername(@PathVariable
String username) {
return
Optional.ofNullable(userService.getUserByUsername(username));
 }
 @DeleteMapping("/{userId}")
public void deleteUserById(@PathVariable String userId) {
userService.deleteUserById(userId);
 }
}