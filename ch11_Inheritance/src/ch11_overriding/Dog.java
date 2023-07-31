package ch11_overriding;

public class Dog extends Animal {

    // 方法覆寫 (Overriding)
    @Override
    void makeSound() {
        super.makeSound(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    // 方法重載 (Overloading)
    void makeSound(int numBarks) {
        for (int i = 0; i < numBarks; i++) {
            System.out.println("狗叫：汪!");
        } 
    }

    @Override
    void eat() {
        super.eat(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    void eat(Animal animal) {
        animal.eat();
    }
    
    void eat(String food) {
        super.eat();
        System.out.println("food: " + food);
    }
}