package lab2;

/**
 *
 * @author tgrady4
 */
public interface Course {
    
    public void setCredits(double credits);
    
    public double getCredits();
    
    public String getCourseName();

    public void setCourseName(String courseName);

    public String getCourseNumber();

    public void setCourseNumber(String courseNumber);
}
