package ie.atu.sw;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        
        // creating new instance of a class (using "new" keyword)
        Student s = new Student(); 

        System.out.println("Student Object ID from Runner: " + s);

        // using setters
        s.setSid(621584540);
        s.setName("Andrii Skvortsov");
        s.setDob(LocalDate.now());
        s.setRegistered(true);

        // invoking methods
        String msg = s.study(2.25d, 2);
        System.out.println(msg);
        
        boolean result = s.execute("Study please!");
        System.out.println("Has a suffix " + "!: " + result);

        // accessing the state
        System.out.println(s.getSid());
        System.out.println(s.getName());
        System.out.println(s.getDob());
        System.out.println(s.isRegistered());
    }
}
