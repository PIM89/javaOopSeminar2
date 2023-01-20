package Task2;

class Human implements Action {
    private String surname; // Фамилия
    private String name;    // Имя


    public Human(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    @Override
    public String toString() {
        return surname + ' ' + name + ' ';
    }

    /**
     * Человек двигает мебель
     */
    @Override
    public void move(Furniture furniture) {
        System.out.println(toString() + "подвинул " + furniture.getType());
    }

    /**
     * Человек двигает протирает мебель
     */
    @Override
    public void wipe(Furniture furniture) {
        System.out.println(toString() + "протёр " + furniture.getType());
    }
}
