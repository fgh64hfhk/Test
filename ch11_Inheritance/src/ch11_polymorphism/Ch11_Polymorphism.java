
package ch11_polymorphism;

import ch11_inheritance.Circle;
import ch11_inheritance.Cylinder;
import ch11_inheritance.Rectangle;
import ch11_inheritance.Shape;
import ch11_inheritance.Square;

public class Ch11_Polymorphism {

    public static void main(String[] args) {
        
        Shape s1 = new Square();
        s1.setGraphicalOrigins(1, 2);
        ((Square)s1).setSide(5);
        double squarePrice = Lands.calculator(250, s1);
        
        Circle c1 = new Circle();
        c1.setGraphicalOrigins(0, 0);
        c1.setRadius(5);
        double circlePrice = Lands.calculator(500, c1);
        
        Circle cy1 = new Cylinder();
        cy1.setRadius(5);
        ((Cylinder)cy1).setHeight(10);
        double cylinderPrice = Lands.calculator(150, cy1);
        
        Rectangle r1 = new Rectangle();
        r1.setHeight(5);
        r1.setWeight(10);
        double rectanglePrice = Lands.calculator(100, r1);
        
        System.out.println("squarePrice --> " + squarePrice + "\n" +
                "circlePrice --> " + circlePrice + "\n" +
                "cylinderPrice --> " + cylinderPrice + "\n" +
                "rectanglePrice --> " + rectanglePrice);
    }
}
