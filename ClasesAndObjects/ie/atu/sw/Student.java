package ie.atu.sw;

import java.time.LocalDate;

public class Student {

    /*
     * Defining some state (instance variables) for the class Student.
     * They will define what the instances of a class will knwow.
     * (the best practice is to make instance inst. vars below PRIVATE.
     * We make them public only for the training purpose)
     */
    public long sid;
    public String name = "Undefined";
    public LocalDate dob;
    public boolean registered = false;

    public Student() {
        System.out.println("The ID of this Student object is " + this);
    }

    // creating methods of a class
    public void register() {
        this.registered = true;
    }

    public void study() {
        System.out.println("Student " + name + " is studying.");
    }

    public void execute() {  // bad name for a method
        System.out.println("Executed.");
    }
}
