//Author: Daniel Flesch
//Date: 04/24/24
//Testing geometry methods using objects

public class ObjOrientedGeometry{

    public class Cube{
        private double height;
     
        /**
           Creates a cube of a given radius.
           @param radius the radius
        */
        public Cube(double height)
        {
           this.height = height;
        }
     
        /**
            Calculates the volume of the cube.
            @return the volume of the cube.
           */
        public double getVolume()
        {
           return Math.pow(height, 3);
        }
     
        /**
           Calculates the surface area of the cube.
           @return the volume of the cube.
        */
        public double getSurface()
        {
           return 6 * Math.pow(height, 2);
        }
    }

    public class Cylinder{
        private double radius;
        private double height;
     
        /**
           Creates a cylinder of a given radius and height.
           @param radius the radius
           @param height the height
        */
        public Cylinder(double radius, double height)
        {
           this.radius = radius;
           this.height = height;
        }
     
        /**
            Calculates the volume of the cylinder.
            @return the volume of the cylinder.
        */
        public double getVolume()
        {
           return Math.PI * Math.pow(radius, 2) * height;
        }
     
        /**
           Calculates the surface area of the cylinder.
           @return the volume of the cylinder.
        */
        public double getSurface()
        {
           return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
        }
    }

    public class Cone{
        private double radius;
        private double height;
     
        /**
           Creates a cone of a given radius and height.
           @param radius the radius
           @param height the height
        */
        public Cone(double radius, double height)
        {
           this.radius = radius;
           this.height = height;
        }
     
        /**
            Calculates the volume of the cone.
            @return the volume of the cone.
        */
        public double getVolume()
        {
           return (1.0 / 3.0) * height * Math.PI * Math.pow(radius, 2);
        }
     
        /**
           Calculates the surface area of the cone.
           @return the volume of the cone.
        */
        public double getSurface()
        {
           return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
        }
    }

    public class Sphere{
    private double radius;

    /**
        Creates a sphere of a given radius.
        @param radius the radius
    */
    public Sphere(double radius)
    {
        this.radius = radius;
    }

    /**
        Calculates the volume of the sphere.
        @return the volume of the sphere.
    */
    public double getVolume()
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    /**
         Calculates the surface area of the sphere.
        @return the volume of the sphere.
    */
    public double getSurface()
    {
        return 4.0 * Math.PI * radius * radius;
    }
    }
}