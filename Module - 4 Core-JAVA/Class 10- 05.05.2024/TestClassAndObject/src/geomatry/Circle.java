package geomatry;

public class Circle {

    double radious = 1;

    public Circle() {
    }

    public Circle(double newRadious) {
        radious = newRadious;
    }

    public double getArea() {

        return Math.PI * Math.pow(radious, 2);
    }

    public double getPerimeter() {
        return 2 * radious * Math.PI;
    }

//    public void setRadious(double newRadious) {
//
//        radious = newRadious;
//    }
}
