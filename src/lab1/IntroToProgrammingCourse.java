package lab1;

//import javax.swing.JOptionPane; <---- Not needed

/**
 * Abstract classes get to utilize code re-use. In this application
 * I think it's ideal.
 * NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      Dan Smith
 * @version     1.00
 */
public class IntroToProgrammingCourse extends Course {
    private String prerequisites;

    /*
     * Constructor -
     * More can be made depending on requirements
     */
    public IntroToProgrammingCourse(String courseName, String courseNumber, 
            double credits) {
        super(courseName, courseNumber, credits);
        // Did this to ensure setPrerequisites is always called when object
        // is instantiated
        this.setPrerequisites(prerequisites);
    }

    /*
     * Set method always assigns N/A to prerequisites
     */
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = "N/A";
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
