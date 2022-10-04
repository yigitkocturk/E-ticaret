package dataAccess.abstracts;

import entities.concretes.User;

public interface UserDao {

	void add(User user);
	void delete(User user);
	boolean login(String email, String password);
	boolean eMailCheck(String eMail);
	boolean eMailCheck1(String eMail);
	
}
