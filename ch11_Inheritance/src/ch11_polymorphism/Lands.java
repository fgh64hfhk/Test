package ch11_polymorphism;

import ch11_inheritance.Shape;
import ch11_inheritance.Circle;
import ch11_inheritance.Rectangle;
import ch11_inheritance.Square;

public class Lands {

    public static double calculator(double price, Shape shape) {

        System.out.println(shape.toString());

        switch (shape) {
            case Circle circle -> {
                return circle.area() * price;
            }
            case Rectangle rectangle -> {
                return rectangle.area() * price;
            }
            case Square square -> {
                return square.area() * price;
            }
            case default -> {
                return -1;
            }
        }
    }
}
