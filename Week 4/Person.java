
/**
 * Person has name and age.
 *
 * @author S.Marzelli
 * @version 2/8/2024
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;

    /**
     * No-argument constructor for objects of class Person
     */
    public Person()
    {
        // initialise instance variables
        name = "";
        age = 0;
    }
    
    /**
     * Argument constructor for objects of class Person
     * that allows to construct a Person object 
     * with a specific name and age
     */
    public Person(String n, int a)
    {
        // initialise instance variables
        name = n;
        age = a;
    }
    
    /**
     * Sets person's name
     *
     * @param  n  person's name
     */
    public void setName(String n)
    {
        name = n;
    }
  
    /**
     * Sets person's age
     *
     * @param  a  person's age
     */
    public void setAge(int a)
    {
        age = a;
    }
       
    /**
     * Return person's name
     *
     * @return    name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Return person's age
     *
     * @return    age
     */
    public int getAge()
    {
        return age;
    }
}
