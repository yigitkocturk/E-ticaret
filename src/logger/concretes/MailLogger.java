package logger.concretes;

import entities.concretes.User;
import logger.abstracts.Logger;

public class MailLogger implements Logger {
    @Override
    public void log(User user) {
        System.out.println("Mail ile loglandı "+ user.getEmail());
    }
}