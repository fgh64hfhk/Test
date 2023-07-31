package ch11_inheritance;

public class Circle extends Shape {

    private double r;

    public Circle() {

    }

    public void setRadius(double r) {
        this.r = r;
    }

    public double getRadius() {
        return this.r;
    }

    public double area(){
        return Math.pow(getRadius(), 2) * Math.PI;
    }
    
    @Override
    public String toString() {
        return """
               Circle -->
               Graphical Origins -> """ + getX() + " , " + getY() + "\n"
                + "Radius: " + this.getRadius();
    }
}
