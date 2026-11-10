package ClassesAndObjectsAndStatic;

import java.awt.*;

public class UseCircle {
    public static void main(String[] args) {
        // Default usage constructor
        Circle c1 = new Circle();

        System.out.println(c1.center); // null
        System.out.println(c1.radius); // 0.0

        c1.center = new Point(0, 0);
        c1.radius = 3.0;

        System.out.println(c1.center); // java.awt.Point[x=0,y=0]
        System.out.println(c1.radius); // 3.0

        c1.setCenter(new Point(1, 2));
        c1.setRadius(5);

        System.out.println(c1.center); // java.awt.Point[x=1,y=2]
        System.out.println(c1.radius); // 5.0
        System.out.println(c1.getArea()); // 78.53981633974483
        System.out.println(c1.getPerimeter()); // 31.41592653589793

        // Constructor with params
        Circle c2 = new Circle(new Point(1, 2), 3);

        System.out.println(c2.center); // java.awt.Point[x=1,y=2]
        System.out.println(c2.radius); // 3.0

        // Use the static method/variable
        System.out.println(Circle.getNumberOfCircles()); // 2
    }
}
