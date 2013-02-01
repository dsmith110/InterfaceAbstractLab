/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Dan Smith
 */
public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double credits;

    /*
     * Two simple constructors
     */
    public Course(String courseName, String courseNumber, double credits) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
    }

    public Course() {
    }
    

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }
    
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    /**
     * @return the courseNumber
     */
    public String getCourseNumber() {
        return courseNumber;
    }

    /**
     * @param courseNumber the courseNumber to set
     */
    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    /**
     * @return the credits
     */
    public double getCredits() {
        return credits;
    }

    /**
     * @param credits the credits to set
     */
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

    // Abstract methods to be implemented by any class that inherits this class
    /**
     * @return the prerequisites
     */
    public abstract String getPrerequisites();

    /**
     * @param prerequisites the prerequisites to set
     */
    public abstract void setPrerequisites(String prerequisites);
}
