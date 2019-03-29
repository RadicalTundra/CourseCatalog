package lab2;

/**
 *
 * @author tgrady4
 */
public class CourseMaker {
    public static void main(String[] args)
    {
        // the things that are bad with only having interfaces is that you can only add headers, so all the method code, even if repeated in every subclass, has to be rewritten. 
        //But the benefit to an interface is that you can be more specifc in categorization of subclasses. This makes polymorphism even more powerful when you can be specific with what you want an object to be.
        IntroToProgrammingCourse Course1 = new IntroToProgrammingCourse("Intro to programming", "123");
        IntroJavaCourse Course2 = new IntroJavaCourse("Intro to Java","223");
        AdvancedJavaCourse Course3 = new AdvancedJavaCourse("Advanced Java Course","323");
        
        System.out.println(Course1.getCourseName() + " has a course number of " + Course1.getCourseNumber());
        System.out.println(Course2.getCourseName() + " has a course number of " + Course2.getCourseNumber());
        System.out.println(Course3.getCourseName() + " has a course number of " + Course3.getCourseNumber());
    }
}
