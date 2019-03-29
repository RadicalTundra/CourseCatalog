package lab1;

/**
 *
 * @author tgrady4
 */
public class CourseMaker {
    public static void main(String[] args)
    {
        // the things that are bad with only having an abstract class is that you can only add things to the abstract class that are included in all subclasses. 
        //But the benefit to an abstract class is that you can define common methods that are in the subclasses, as well as declare variables.
        Course Course1 = new IntroToProgrammingCourse("Intro to programming", "123");
        Course Course2 = new IntroJavaCourse("Intro to Java","223");
        Course Course3 = new AdvancedJavaCourse("Advanced Java Course","323");
        
        System.out.println(Course1.getCourseName() + " has a course number of " + Course1.getCourseNumber());
        System.out.println(Course2.getCourseName() + " has a course number of " + Course2.getCourseNumber());
        System.out.println(Course3.getCourseName() + " has a course number of " + Course3.getCourseNumber());
    
    
    }
}
