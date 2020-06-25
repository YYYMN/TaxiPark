package by.novikau.taxipark.service.user;

import by.novikau.taxipark.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

	Optional<User> getUser(Long id);

	List<User> getAllUsers();

	User createUser(User user);
}
