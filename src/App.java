import java.util.LinkedList;
import java.util.List;

import birds.Hummingbird;
import mammals.RedPanda;
import reptiles.GreenIguana;
import utils.Animal;

public class App {
    private static List<Animal> createAnimals(){
        List<Animal> animals = new LinkedList<>();
        animals.add(new Hummingbird("Ruby", (short) 2));
        animals.add(new RedPanda("Kaida", (short) 4));
        animals.add(new GreenIguana("Draco", (short) 6));
        return animals;
    }

    private static void printAnimalsInfo(List<Animal> animals){
        for (Animal animal: animals){
            System.out.println(animal);
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, welcome to the zoo");
        List<Animal> animals = createAnimals();
        printAnimalsInfo(animals);

    }
}
