//Author Daniel Flesch
//Date: 02/13/24
//Tests the Course Class

public class CourseTester {
     public static void main(String[] args)
     {
        Course course1 = new Course();
        course1.setTitle("GEN-1234");
        course1.setInstructor("John Smith");
        System.out.println("\nCourse: "+course1.getTitle()+ ", Instructor: "+course1.getInstructor()+"\n");

        Course course2 = new Course("CIST-1001", "Jennifer Smith");
        System.out.println("\nCourse: "+course2.getTitle()+ ", Instructor: "+course2.getInstructor()+"\n");
     }
}
