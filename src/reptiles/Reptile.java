package reptiles;

import utils.Animal;

public abstract class Reptile extends Animal {
    // Attributes
    private static final String reproduction = "Oviparous";
    private static final Boolean vertebrate = true;

    public Reptile(String name, short age, String specie, String environment, String alimentation) {
        super(name, age, specie, environment, alimentation);
    }

    @Override
    public String toString() {
        return String.format("%s, Type: Reptile, Reproduction: %s, %s",
         super.toString(), reproduction, 
         vertebrate ? "is vertebrate": "is not a vertebrate")
        ;
    }
    
}