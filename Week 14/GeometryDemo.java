// Author: Daniel FLesch
//Date: 04/24/24
//Testing geometry methods and objects
import java.util.Scanner;
public class GeometryDemo {

    public static void main(String[] args){
        System.out.println("Enter a height value: ");
        Scanner input = new Scanner(System.in);
        double h = input.nextDouble();

        System.out.println("Enter a radius value: ");
        double r = input.nextDouble();
        input.close();

        ObjOrientedGeometry geom = new ObjOrientedGeometry();
        ObjOrientedGeometry.Cube cube = geom.new Cube(h);
        ObjOrientedGeometry.Sphere sphere = geom.new Sphere(r);
        ObjOrientedGeometry.Cylinder cylinder = geom.new Cylinder(r, h);
        ObjOrientedGeometry.Cone cone = geom.new Cone(r, h);

        System.out.printf("\nCube volume: %.2f\n", cube.getVolume());
        System.out.printf("Cube surface: %.2f\n\n", cube.getSurface());

        System.out.printf("Sphere volume: %.2f\n", sphere.getVolume());
        System.out.printf("Sphere surface: %.2f\n\n", sphere.getSurface());

        System.out.printf("Cylinder volume: %.2f\n", cylinder.getVolume());
        System.out.printf("Cylinder surface: %.2f\n\n", cylinder.getSurface());

        System.out.printf("Cone volume: %.2f\n", cone.getVolume());
        System.out.printf("Cone surface: %.2f\n\n", cone.getSurface());
    }
}