// Author: Daniel FLesch
//Date: 04/24/24
//Testing geometry methods
import java.util.Scanner;
public class GeometryTester {

    public static void main(String[] args){
        System.out.println("Enter a height value: ");
        Scanner input = new Scanner(System.in);
        double h = input.nextDouble();

        System.out.println("Enter a radius value: ");
        double r = input.nextDouble();
        input.close();
        System.out.printf("\nCube volume: %.2f\n", Geometry.cubeVolume(h));
        System.out.printf("Cube surface: %.2f\n", Geometry.cubeSurface(h));

        System.out.printf("Sphere volume: %.2f\n", Geometry.sphereVolume(h));
        System.out.printf("Sphere surface: %.2f\n", Geometry.sphereSurface(h));

        System.out.printf("Cylinder volume: %.2f\n", Geometry.cylinderVolume(r, h));
        System.out.printf("Cylinder surface: %.2f\n", Geometry.cylinderSurface(r, h));

        System.out.printf("Cone volume: %.2f\n", Geometry.coneVolume(r, h));
        System.out.printf("Cone surface: %.2f\n", Geometry.coneSurface(r, h));
    }
}