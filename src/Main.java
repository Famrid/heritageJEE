import Animal.Animal;
import Animal.Hippo;
import Animal.Lion;
import Animal.Wolf;
import Animal.Dog;
import Animal.Pet;
import Animal.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Animal wolf = new Wolf();
        Animal hippo = new Hippo();
        Animal lion = new Lion();
        Pet dog = new Dog();
        Pet cat = new Cat();

        List<Animal> animals = new ArrayList<>();
        List<Pet> pets = new ArrayList<>();
        animals.add(wolf);
        animals.add(hippo);
        animals.add(lion);
        pets.add(cat);
        pets.add(dog);
        animals.forEach(animal -> animal.eat());
        pets.forEach(pet -> pet.beNice());
    }
}