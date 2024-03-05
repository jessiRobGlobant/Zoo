package mammals;

import utils.Animal;

public abstract class Mammal extends Animal {
    // attributes
    private static final String reproduction = "Viviparous";
    private static final Boolean vertebrate = true;

    public Mammal(String name, short age, String specie, String environment, String alimentation) {
        super(name, age, specie, environment, alimentation);
    }

    @Override
    public String toString() {
        return String.format("%s, Type: Mammal, Reproduction: %s, %s",
         super.toString(), reproduction, 
         vertebrate ? "is vertebrate": "is not a vertebrate")
        ;
    }
    
}