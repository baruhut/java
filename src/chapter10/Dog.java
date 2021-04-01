package chapter10;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("woof");
    }

    public void fetch() {
        System.out.println("fetch is fun!");
    }

    public void runPace() {
        System.out.println("Rocky goin slow and low");
    }

    public void sleepTime(String name) {
        System.out.println(name + " sleep on a bench");
    }
}