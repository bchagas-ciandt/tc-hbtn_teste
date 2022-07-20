import java.util.regex.Pattern;

public class Person {
    private String user;
    private String password;

    public Person() {
    }

    public boolean checkUser() {
        boolean isChecked = false;
        if (Pattern.matches("^[a-zA-Z0-9]{8,100}$", user)) {
            isChecked = true;
        }
        return isChecked;
    }

    public boolean checkPassword() {
        boolean isChecked = false;
        if (Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[-+_!@#$%^&*., ?]).+$", password) && password.length() >= 8) {
            isChecked = true;
        }
        return isChecked;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
