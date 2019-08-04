package info.sjd.model;

public class Teacher extends User{

    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String login, String password, String first_name, String last_name, String subject) {
        super(login, password, first_name, last_name);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + " " + subject;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.clone();
    }
}
