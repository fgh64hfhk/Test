package ch11_inheritance;

public class Cylinder extends Circle {

    private double h;

    public Cylinder() {
    }

    public void setHeight(double h) {
        this.h = h;
    }

    public double getHeight() {
        return this.h;
    }

    public double volume() {
        return Math.pow(super.getRadius(), 2) * Math.PI * this.getHeight();
    }

    @Override
    public String toString() {
        return """
               Cylinder -->
               Graphical Origins --> """ + getX() + " , " + getY() + "\n"
                + "Radius: " + super.getRadius() + "\n"
                + "Height: " + this.getHeight();
    }
}
