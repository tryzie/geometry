public class Geometry {
    public double area (int side){
        return side * side;
    }

    public double area (double radius){
        return Math.PI * radius * radius;
    }

    public double area (double length, double breadth) {
        return length * breadth;
    }

    public double area (double base, double hieght, boolean isTriangele){
        if (isTriangele) {
           return 0.5 * base * hieght;
        } else {
            throw new IllegalArgumentException("isTriangle must be true for triangle area calculation");
        }
    }
}
