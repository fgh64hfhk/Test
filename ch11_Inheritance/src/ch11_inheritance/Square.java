package ch11_inheritance;

public class Square extends Shape {

    private double side;

    public Square() {

    }

    public void setSide(double s) {
        this.side = s;
    }

    public double getSide() {
        return this.side;
    }

    public double area(){
        return Math.pow(getSide(), 2);
    }
    
    @Override
    public String toString() {
        return """
               Square -->
               Graphical Origins -> """ + getX() + " , " + getY() + "\n"
                + "Side: " + this.getSide();
    }
}
