
/**
 * Write a description of class PersonTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonTester
{
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.setName("Mark");
        p1.setAge(20);
        System.out.println(p1.getName() + "  " + p1.getAge());
        
        Person p2 = new Person("Susan", 25);
        System.out.println(p2.getName() + "  " + p2.getAge());
    }
}
