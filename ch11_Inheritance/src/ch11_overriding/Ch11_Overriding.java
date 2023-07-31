
package ch11_overriding;

public class Ch11_Overriding {

    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();
        genericAnimal.eat();
        
        System.out.println("----");
        
        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();
        System.out.println("----");
        
        dog.makeSound(3);
        dog.eat(genericAnimal);
        dog.eat("MEAT");
    } 
}