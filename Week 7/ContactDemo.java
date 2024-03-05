//Author Daniel Flesch
// Date: 02/28/2024
// Tests out the contact class by making a contact with name, email, and phone number
public class ContactDemo {
    public static void main(String[] args) {
        Contact c1 = new Contact();
        c1.setName("Jeff");
        c1.setEmail("jeffb@gmail.com");
        c1.setPhone("609-121-1001");

        System.out.printf("\nName: %s \t Email: %s \t Phone Number: %s", c1.getName(), c1.getEmail(), c1.getPhone() + "\n");

        Contact c2 = new Contact("Ella", "ellam@yahoo.com", "609-900-3200");
        System.out.printf("\nName: %s \t Email: %s \t Phone Number: %s", c2.getName(), c2.getEmail(), c2.getPhone());

    }
}
