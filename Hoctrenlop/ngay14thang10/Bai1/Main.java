package Hoctrenlop.ngay14thang10.Bai1;

abstract class Animal {
    protected String name;


    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}

class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override 
    public void makeSound() {
        System.out.println("Gau Gau");
    }
}
class Cat extends Animal{
    

    public Cat(String name) {
        super(name);
    }

    @Override 
    public void makeSound() {
        System.out.println("Meo Meo");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Quang");
        animals[1] = new Cat("Quang1");

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}