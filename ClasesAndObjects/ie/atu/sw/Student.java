package ie.atu.sw;

import java.time.LocalDate;

public class Student {

    /*
     * Defining some state (instance variables) for the class Student.
     * instance instance variables shall always be PRIVATE.
     */
    private long sid;
    private String name = "Undefined";
    private LocalDate dob;
    private boolean registered = false;

    // constructor; no return type; name matches class name
    public Student() {
        System.out.println("The ID of this Student object is " + this);
    }

    // generated getters & setters:
    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean reg) {
        this.registered = reg;
    }

    // creating other methods of a class
    protected void register() {
        this.registered = true;
    }

    protected String study(double hours, int level) {
        double total = hours * level;
        String message = "Studying..." + total;
        return message;
    }

    protected boolean execute(String command) { // bad name for a method
        System.out.println("Executed.");
        return command.endsWith("!");
    }
}
