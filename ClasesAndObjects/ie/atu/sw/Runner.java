package ie.atu.sw;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        
        // creating new instance of a class (using "new" keyword)
        Student s = new Student(); 

        System.out.println("Student Object ID from Runner: " + s);

        s.sid = 62158454;
        s.name = "Andrii Skvortsov";
        s.dob = LocalDate.now();

        // invoking methods
        s.register();
        s.study();
        s.execute();

        // accessing the state
        System.out.println(s.sid);
        System.out.println(s.name);
        System.out.println(s.dob);
        System.out.println(s.registered);
    }
}
