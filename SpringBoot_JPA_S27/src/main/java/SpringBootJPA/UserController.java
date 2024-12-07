package SpringBootJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins="https://localhost:3000")
public class UserController {

	@Autowired
	UserRepository userRepository;
	@GetMapping
	public List<User> getAllUsers() {
		return UserRepository.findAll();
		
	}
	public User createUser(User user) {
		return userRepository.save(user);
	}
}