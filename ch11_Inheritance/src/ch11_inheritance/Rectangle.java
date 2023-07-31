package ch11_inheritance;

public class Rectangle extends Shape {

    private double weight, height;

    public Rectangle() {

    }

    public void setWeight(double w) {
        this.weight = w;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getHeight() {
        return this.height;
    }
    
    public double area(){
        return this.getHeight() * this.getWeight();
    }

    @Override
    public String toString() {
        return """
               Rectangle --> 
               Graphical Origins -> """ + getX() + " , " + getY() + "\n"
                + "Weight: " + this.getWeight() + "\n"
                + "Height: " + this.getHeight();
    }
}
