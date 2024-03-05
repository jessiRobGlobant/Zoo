package utils;

/**
 * utils.Animal
 */
public abstract class Animal {

    // Attributes
    private String name;

    private short age;

    private String specie;

    private String environment;
    private String alimentation;
    

    public Animal(String name, short age, String specie, String environment, String alimentation) {
        this.name = name;
        this.age = age;
        this.specie = specie;
        this.environment = environment;
        this.alimentation = alimentation;
    }

    

    protected void setName(String name) {
        this.name = name;
    }



    protected void setAge(short age) {
        this.age = age;
    }



    protected void setSpecie(String specie) {
        this.specie = specie;
    }



    protected void setEnvironment(String environment) {
        this.environment = environment;
    }



    protected void setAlimentation(String alimentation) {
        this.alimentation = alimentation;
    }



    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Specie: %s, Environment: %s, Alimentation: %s",
                             name, age, specie, environment, alimentation);
    }
    
}