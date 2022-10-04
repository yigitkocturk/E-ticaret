package business.concretes;

import business.abstracts.UserService;
import core.abstracts.GoogleService;
import core.concretes.GoogleManagerAdapter;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class UserManager implements UserService{

	 @Override
	    public void newUser(User user) {
	    Conditions conditions = new Conditions();
	    boolean checkPassword = conditions.passwordCheck(user);
	    boolean emailFormat = conditions.eMailFormat(user);

	    if (checkPassword && emailFormat){
	        UserDao userDao1 = new HibernateUserDao();
	        userDao1.add(user);
	        System.out.println("Kayıt başarılı");
	        return;
	    }else{
	        System.out.println("Kayıt başarısız");
	    }

	    }

	    @Override
	    public void login(String eMail, String password) {
	        UserDao userDao = new HibernateUserDao();
	        userDao.login(eMail, password);
	    }

	    @Override
	    public void googleLogin(User user) {
	        GoogleService googleService = new GoogleManagerAdapter();
	        googleService.gLoggin("Google ile giriş yapıldı");
	    }

	    @Override
	    public void delete(User user) {
	        UserDao userDao = new HibernateUserDao();
	        userDao.delete(user);
	    }
}
