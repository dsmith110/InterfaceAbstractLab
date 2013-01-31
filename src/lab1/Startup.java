/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Dan Smith
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
