package pro.ivashchuk.moviesadvisor.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserRegistrationForm {

    final static Logger log = LoggerFactory.getLogger(UserRegistrationForm.class);

    private String username;
    private String password;
    private String phrase;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
}
