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

    // constructor
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

    protected void study() {
        System.out.println("Student " + name + " is studying.");
    }

    protected void execute() { // bad name for a method
        System.out.println("Executed.");
    }
}
