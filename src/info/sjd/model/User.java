package info.sjd.model;

public class User {
    private String login;
    private String password;
    private String first_name;
    private String last_name;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public User(String login, String password, String first_name, String last_name) {
        this.login = login;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public User() {
    }

    public User clone (User user) {
        User clone = new User(user.login,user.password, user.first_name, user.last_name);
        return clone;
    }

    @Override
    public String toString() {
        return login + " " + password + " " +  first_name + " " + last_name;
    }
}
