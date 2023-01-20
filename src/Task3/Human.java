package Task3;


public class Human implements HumanAction {
    private String surname; // Фамилия
    private String name;    // Имя


    public Human(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    /**
     * Взаимодействие человека и кота (человек гладит кота, кот отвечает)
     */
    @Override
    public void calling(Animal animal) {
        System.out.println(surname + " " + name + " зовет " + animal.getType() + " " + animal.getName());
        animal.voice();
    }

    @Override
    public String toString() {
        return surname + ' ' + name + ' ';
    }
}
