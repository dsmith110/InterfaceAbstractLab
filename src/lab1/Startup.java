/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * I think this architecture for this program is pretty
 * good. After some thought I should have named the super
 * class ProgrammingCourse and had that inherit Course, 
 * because the sub-classes in this program are a very
 * specific type of course, likewise ProgrammingCourse would be a 
 * more specific type of Course. Also the program has versatility
 * with this architecture and allows the author of main to
 * use Liskov's substitution method when instantiating objects,
 * This can be used because all the sub classes of Course (in
 * this case) are interchangeable.
 * -----------------------------------------------------
 * @author  Dan Smith
 * @version 1.00
 */
public class Startup {
    
    
    public static void main(String[] args) {
        // Instantiate objects
        Course course1 = new AdvancedJavaCourse("Advanced Java", "145-902", 4);
        Course course2 = new IntroJavaCourse("Intro to Java", "145-901", 4);
        Course course3 = new IntroToProgrammingCourse("Intro to Programming", 
                "145-900", 2);
        
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
