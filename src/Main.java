import business.abstracts.UserService;
import business.concretes.UserManager;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserDao userDao = new HibernateUserDao();
        UserService userService = new UserManager();

        User enes = new User(1,"Yiğit","Koçtürk","yigit@hotmail.com","123456");
        userService.newUser(enes);

        User enes2 = new User(2,"ahmet","Mehmet","ahmet@hotmail.com","123456");
        userService.newUser(enes2);

	}

}
