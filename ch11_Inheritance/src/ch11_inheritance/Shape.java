package ch11_inheritance;

public class Shape {

    private double x, y;

    public Shape() {

    }

    public void setGraphicalOrigins(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + ")";
    }
}
