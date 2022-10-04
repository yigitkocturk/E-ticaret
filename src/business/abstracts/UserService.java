package business.abstracts;

import entities.concretes.User;

public interface UserService {

	void newUser(User user);
	void login(String email, String password);
	void googleLogin(User user);
	void delete(User user);
}
