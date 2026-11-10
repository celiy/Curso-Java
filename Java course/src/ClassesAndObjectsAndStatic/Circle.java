package ClassesAndObjectsAndStatic;

import java.awt.*;

public class Circle {
    Point center;
    Double radius;
    // static means the member belongs to the class itself, not to an object, so it
    // can be used as Circle.numberOfCircles without creating a Circle.
    // Since all Circle objects share it, this one counter is used by every circle.
    // Each constructor increments it, so it counts how many circles were created.
    // Private so that an object can't just obj.numberOfCircle = value;
    private static int numberOfCircles;

    // Constructors
    Circle(Point initialCenter, double initialRadius) {
        center = initialCenter;
        radius = initialRadius;
        numberOfCircles++;
    } // used when Circle obj = new Circle(params);

    Circle() {
        numberOfCircles++;
    } // used when Circle obj = new Circle();

    // Encapsulation: fields are hidden and accessed only through methods, so the class controls how they change.

    // Accessor (getter): reads a private value without exposing the field itself.
    static int getNumberOfCircles() {
        return numberOfCircles;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    // Mutator (setter): changes a value through a method, so the class can validate it before storing it.
    void setRadius(double newRadius) {
        radius = newRadius;
    }

    // Mutator (setter): changes the center through a method instead of assigning the field directly.
    void setCenter(Point newCenter) {
        center = newCenter;
    }
}
