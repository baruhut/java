package chapter10;

public class Zoo {

    public static void main(String[] arg) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        rocky.runPace();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();
        sasha.runPace();
        ((Dog) sasha).sleepTime("sasha");
        feed(sasha);

        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch();
        feed(sasha);

    }

    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("here's your dog food");
        } else if (animal instanceof Cat) {
            System.out.println("here's your cat food");
        }
    }


}
