/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author dsmith110
 */
public interface Course {
    public abstract void setCourseName(String courseName);
    public abstract String getCourseName();
    public abstract void setCourseNumber(String courseNumber);
    public abstract String getCourseNumber();
    public abstract void setCredits(double credits);
    public abstract double getCredits();
    public abstract void setPrerequisites(String prerequisites);
    public abstract String getPrerequisites();
}
