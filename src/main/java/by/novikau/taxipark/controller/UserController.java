package by.novikau.taxipark.controller;

import by.novikau.taxipark.entity.Driver;
import by.novikau.taxipark.entity.User;
import by.novikau.taxipark.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {

		this.userService = userService;
	}

	@GetMapping
	public List<User> getAllDrivers() {

		return userService.getAllUsers();
	}

	@GetMapping("{id}")
	public Optional<User> getUserById(@PathVariable("id") Long id) {

		return userService.getUser(id);
	}
}
