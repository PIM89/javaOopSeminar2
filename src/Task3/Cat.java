package Task3;

public class Cat extends Animal implements AnimalAction{
    private String breed;       // порода
    private String typeOfWool;  // тип шерсти

    public Cat(String type, String name, String colour, int weight, int height, String breed, String typeOfWool) {
        super(type, name, colour, weight, height);
        this.breed = breed;
        this.typeOfWool = typeOfWool;
    }

    @Override
    public void voice() {
        System.out.println(this.getType() + " " + this.getName() + " мяучит");
    }
}
