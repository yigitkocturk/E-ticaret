package dataAccess.concretes;

import logger.abstracts.Logger;
import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;
import logger.concretes.MailLogger;


public class HibernateUserDao implements UserDao {

	 static List<User> users = new ArrayList<>();

	    @Override
	    public void add(User user) {
	        users.add(user);
	        System.out.println("Hibernate ile kullanıcı eklendi " + user.getName());
	        Logger logger = new MailLogger();
	        logger.log(user);
	    }

	    @Override
	    public void delete(User user) {
	        users.remove(user);
	        System.out.println("Hibernate ile kullanıcı silindi " + user.getName());
	    }

	    @Override
	    public boolean login(String eMail, String password) {
	        for (User user1 : users){
	            if (eMail == user1.getEmail() && password == user1.getPassword()){
	                System.out.println("Sisteme giriş yaptınız "+ user1.getName());
	                return true;
	            }
	        }
	        System.out.println("Hatalı giriş");
	        return false;
	    }

	    @Override
	    public boolean eMailCheck(String eMail) {
	        for (User user1 : users){
	            if (user1.getEmail().equals(eMail)){
	                System.out.println("Kayıtlı email adresi, başka adres girin");
	                return false;
	            }
	        }
	        return true;
	    }

		@Override
		public boolean eMailCheck1(String eMail) {
			// TODO Auto-generated method stub
			return false;
		}
}