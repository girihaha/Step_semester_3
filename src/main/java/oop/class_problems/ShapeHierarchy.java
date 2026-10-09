package oop.class_problems;

abstract class Shape {
    abstract double getArea();
    abstract void draw();
}

class CircleShape extends Shape {
    double radius;
    CircleShape(double radius) { this.radius = radius; }
    double getArea() { return Math.PI * radius * radius; }
    void draw() { System.out.printf("Drawing Circle | Area: %.2f%n", getArea()); }
}

class RectShape extends Shape {
    double w, h;
    RectShape(double w, double h) { this.w = w; this.h = h; }
    double getArea() { return w * h; }
    void draw() { System.out.printf("Drawing Rectangle | Area: %.2f%n", getArea()); }
}

public class ShapeHierarchy {
    public static void main(String[] args) {
        Shape s1 = new CircleShape(5.0);
        Shape s2 = new RectShape(4.0, 6.0);
        s1.draw();
        s2.draw();
    }
}
