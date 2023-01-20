package Task3;

public class Animal implements AnimalAction {
    private String type;    // вид животного
    private String name;    // имя
    private String colour;  // цвет
    private int weight;  // вес
    private int height;  // рост

    public Animal(String type, String name, String colour, int weight, int height) {
        this.type = type;
        this.name = name;
        this.colour = colour;
        this.weight = weight;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void voice() {
        System.out.println(this.getType() + " " + this.getName() + " издает звук");
    }
}
