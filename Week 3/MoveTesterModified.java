import java.awt.Rectangle;

public class MoveTesterModified
{
    public static class AreaTester {
        public static void main(String[] args) {
            Rectangle box = new Rectangle(5, 10, 20, 30);
            double width = box.getWidth();
            double height = box.getHeight();
            double area = width * height;
    
            System.out.println("Area of the rectangle: " + area);
            System.out.println("Expected: 600");
        
        

        System.out.println("x: ");
        System.out.println(box.getX());
        System.out.println("Expected: 20");

        System.out.println("y: ");
        System.out.println(box.getY());
        System.out.println("Expected: 35");

        System.out.println("Width: ");
        System.out.println(box.getWidth());
        System.out.println("Expected: 20");

        System.out.println("Height: ");
        System.out.println(box.getHeight());
        System.out.println("Expected: 30");

        box.setSize(30, 50);
        System.out.println("\n"+box.getWidth());
        System.out.println("\nExpected Width : 30 \n");
        System.out.println(box.getHeight());
        System.out.println("\nExpected Height: 50 \n");
        }
    }
}