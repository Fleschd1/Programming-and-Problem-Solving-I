//Author Daniel Flesch
// Date: 02/28/24
// Makes a contact class that contains a name, email, and phone number

public class Contact {
    private String name;
    private String phone;
    private String email;

    public Contact()
    {
        name = "";
        phone = "";
        email = "";
    }

    public Contact(String n, String e , String p){
        name = n;
        email = e;
        phone = p;
    }

    //Setters
    public void setName(String n){
        name = n;
    }

    public void setEmail(String e){
        email = e;
    }

    public void setPhone(String p){
        phone = p;
    }

    //Getters
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPhone(){
        return phone;
    }
}
