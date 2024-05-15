//Author: Daniel Flesch
//Date: 04/18/24
// Does student stuff
import java.util.ArrayList;
public class StudentArrayList{
static class Student{
    private String id;
    private String name;
    private String major;

    public Student(String id, String name, String major){
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public String getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getMajor(){
        return major;
    }
}
class StudentDemo{
    public static void main(String[] args){
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("1121", "Daniel", "CIS"));
        studentList.add(new Student("1151", "Ella", "Nursing"));
        studentList.add(new Student("1161", "Alex", "Marine Biology"));

        for(Student student : studentList){
            System.out.println("ID: " + student.getID() + " Name: " + student.getName() + " Major: " + student.getMajor() + "\n");
        }
    }
}
}