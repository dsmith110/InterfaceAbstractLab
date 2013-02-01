package lab1;

import javax.swing.JOptionPane;

/**
 * Inheriting abstract super class.
 *
 * @author      Dan Smith
 * @version     1.00
 */
public class IntroJavaCourse extends Course {
    private String prerequisites;

    /*
     * Constructors -
     * More can be made depending on requirements
     */
    public IntroJavaCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber, credits);
    }
    
    // Getters and Setters
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    
    public String getPrerequisites() {
        return prerequisites;
    }
    
    @Override
    public String toString() {
        return "To enroll in " + super.getCapitalizedCourseName() 
                + ".\nYou must have "+ "obtained a C or better in the "
                + "following courses\n-------------------------------\n" 
                + prerequisites;
    }
}
