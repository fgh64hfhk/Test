
package ch11_inheritance;

public class Ch11_Inheritance {

    public static void main(String[] args) {
        
        Shape s1 = new Shape();
        s1.setGraphicalOrigins(1, 2);
        System.out.println("GraphicalOrigins: " + s1.toString());
        
        Circle c1 = new Circle();
        c1.setGraphicalOrigins(3, 4);
        c1.setRadius(5);
        double c1Area = c1.area();
        System.out.println("area: " + c1Area + "\n" + c1.toString());

        Cylinder cy1 = new Cylinder();
        cy1.setGraphicalOrigins(6, 7);
        cy1.setRadius(7.5);
        cy1.setHeight(8);
        double volume = cy1.volume();
        System.out.println("volume: " + volume + "\n" + cy1.toString());

        Rectangle r1 = new Rectangle();
        r1.setGraphicalOrigins(9, 10);
        r1.setHeight(11);
        r1.setWeight(12);
        double r1Area = r1.area();
        System.out.println("area: " + r1Area + "\n" + r1.toString());
    } 
}
