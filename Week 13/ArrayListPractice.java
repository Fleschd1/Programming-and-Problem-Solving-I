//Author:  Daniel Flesch
//Date:   04/15/24
// Array Lists
import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList nameList1 = new ArrayList<>();

        nameList1.add("Java");
        nameList1.add("is");
        nameList1.add("fun!");

        System.out.println(nameList1);

        nameList1.set(2, "very");

        System.out.println(nameList1);

        nameList1.add("interesting");

        System.out.println(nameList1);
    }
}
