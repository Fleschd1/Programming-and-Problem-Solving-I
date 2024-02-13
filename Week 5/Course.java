//Author: Daniel Flesch
// Date: 2/12/24
// A class designed for making a college course with a title and instructor.
public class Course
{ //instance variables
    private String title;
    private String instructor;

    /** 
     * no arguement constructor
     * */ 
    public Course()
    { //initialize instance variables
        title = "";
        instructor = "";
    }

    /**
     * two arguement constructor
     * @param t
     * @param i
     *  */ 
    public Course(String t, String i)
    { //initialize instance variables
        title = t;
        instructor = i;
    }

    /**
     * sets the title of the course.
     * @param t
     */
    public void setTitle(String t)
    {
        title = t;
    }

    /**
     * sets the instructor for the course.
     * @param i
     */
    public void setInstructor(String i)
    {
        instructor = i;
    }

    /**
     * gets the name of the course.
     * @return title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * gets the instructor teaching the course.
     * @return instructor
     */
    public String getInstructor()
    {
        return instructor;
    }
}