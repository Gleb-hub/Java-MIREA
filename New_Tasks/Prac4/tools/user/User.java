package tools.user;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return login + ": " + password;
    }
}
