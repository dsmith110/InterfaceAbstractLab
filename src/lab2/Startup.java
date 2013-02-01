/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * An interface in this lab is fine to use. However, the content in
 * this program makes using an interface super class redundant and it 
 * doesn't fully benefit from code re-usability because the programmer 
 * has to implement all the getters and setters from the interface and 
 * declare the same properties in all the sub-classes. You can still use
 * Liskov substitution method with an interface, which I did not know, so
 * code re-usability is still valid, but with the extra work involved
 * it makes more sense to use an abstract super class.
 * -----------------------------------------------------------------
 * @author  Dan Smith
 * @version 1.00
 */
public class Startup {
    
    
    public static void main(String[] args) {
        // Instantiate objects
        /*
         * Testing to see if Liskov substitution principle can be used 
         * with an interface.
         */
        Course course1 = new AdvancedJavaCourse("Advanced Java", "145-902", 4);
        Course course2 = new IntroJavaCourse("Intro to Java", "145-901", 4);
        Course course3 = new IntroToProgrammingCourse("Intro to Programming", 
                "145-900", 2);
//        AdvancedJavaCourse course1 = new AdvancedJavaCourse("Advanced Java", 
//                "145-902", 4);
//        IntroJavaCourse course2 = new IntroJavaCourse("Intro to Java", "145-901",
//                4);
//        IntroToProgrammingCourse course3 = new IntroToProgrammingCourse
//                ("Intro to Programming", "145-900", 2);
        
        // Set Prerequisites
        course1.setPrerequisites("Intro to Programming, Intro to Java");
        course2.setPrerequisites("Intro to Programming");

        System.out.println(course1);
        System.out.println("");
        System.out.println(course2);
        System.out.println("");
        System.out.println(course3);
        
    }
}
