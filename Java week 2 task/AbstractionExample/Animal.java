package AbstractionExample;

abstract class Animal {
    abstract void makeSound();
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
