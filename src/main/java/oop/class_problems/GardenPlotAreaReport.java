package oop.class_problems;

abstract class GardenShape {
    String owner;
    GardenShape(String owner) { this.owner = owner; }
    abstract double calculateArea();
    abstract String getShapeName();
}

class CirclePlot extends GardenShape {
    double radius;
    CirclePlot(String owner, double radius) { super(owner); this.radius = radius; }
    double calculateArea() { return Math.PI * radius * radius; }
    String getShapeName() { return "CIRCLE"; }
}

class RectanglePlot extends GardenShape {
    double l, w;
    RectanglePlot(String owner, double l, double w) { super(owner); this.l = l; this.w = w; }
    double calculateArea() { return l * w; }
    String getShapeName() { return "RECTANGLE"; }
}

class TrianglePlot extends GardenShape {
    double b, h;
    TrianglePlot(String owner, double b, double h) { super(owner); this.b = b; this.h = h; }
    double calculateArea() { return 0.5 * b * h; }
    String getShapeName() { return "TRIANGLE"; }
}

public class GardenPlotAreaReport {
    public static void main(String[] args) {
        GardenShape[] plots = {
            new CirclePlot("Ravi", 7.0),
            new RectanglePlot("Anitha", 10.0, 15.0),
            new TrianglePlot("Karan", 6.0, 8.0)
        };

        double totalArea = 0;
        for (GardenShape p : plots) {
            double a = p.calculateArea();
            totalArea += a;
            System.out.printf("%s (%s): %.2f%n", p.owner, p.getShapeName(), a);
        }
        System.out.printf("Total Area: %.2f%n", totalArea);
    }
}
