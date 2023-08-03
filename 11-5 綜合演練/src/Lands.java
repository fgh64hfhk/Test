
class Land {

    double area() {
        return 0;
    }
}//class Lands
//--------------------------------

class Circle extends Land {

    int r;
    final double PI = 3.14159;

    Circle(int r) {
        this.r = r;
    }

    @Override
    double area() {
        return r * r * PI;
    }
}//class Circle
//--------------------------------

class Square extends Land {

    int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}//class Square
//--------------------------------

class Calculator {

    double price;

    Calculator(double price) {
        this.price = price;
    }

    double calculatePrice(Land L) {
        return L.area() * price;
    }

    //傳遞不定數量的參數 -- 使用陣列
    double calculateAllPrices(Land[] Ls) {
        double total = 0;
        for (Land L : Ls) {
            total += calculatePrice(L);
        }
        return total;
    }

    //傳遞不定數量的參數 -- Varargs 機制
    double calculateAllPrices1(Land... Ls) {
        double total = 0;
        for (Land L : Ls) {
            total += calculatePrice(L);
        }
        return total;
    }

    //傳遞不定數量的參數 -- 指定單位的對應方法
    static double calculateOnePrice(double price, Land... Ls) {
        double total = 0;
        for (Land L : Ls) {
            total += L.area() * price;
        }
        return total;
    }
    
    //傳遞任意型別的參數 -- Object... objs
    static double calculateAnyTypePrice(double price, Object... objs) {
        double total = 0;
        double temp = 0;
        
        for (Object o: objs) {
            if(o instanceof Land land){
                temp = land.area() * price;
                total += temp;
            } else if (o instanceof  Integer integer){
                total += temp * (integer - 1);
            }
        }
        return total;
    }
}//class Calculator
//--------------------------------

public class Lands {

    public static void main(String[] args) {
        Circle c = new Circle(5);
        Square s = new Square(5);
        
        Circle c1 = new Circle(10);
        Square s1 = new Square(10);

        Calculator cal = new Calculator(3000);

        //使用匿名陣列將 Land 物件放入陣列之中，傳遞給 calculateAllPrice()
        System.out.println("Total Value:" + cal.calculateAllPrices(new Land[]{c, s}));
        System.out.println("Total Value:" + cal.calculateAllPrices1(c, s));
        System.out.println("-------------------------------------------------------");
        System.out.println("Value x:" + Calculator.calculateOnePrice(4000, c));
        System.out.println("Total Value:" + Calculator.calculateOnePrice(5000, c,s,c1,s1));
        System.out.println("-------------------------------------------------------");
        System.out.println("Value x:" + Calculator.calculateAnyTypePrice(4000, c));
        System.out.println("Total Value:" + Calculator.calculateAnyTypePrice(4000, c,s));
        System.out.println("Total Value:" + Calculator.calculateAnyTypePrice(3000, s,2,c,3));
    }
}
