package Task3;

/* Подумать как описать логику взаимодействия человека и домашнего питомца.
Сценарий: “Человек “зовёт” котика “кис-кис”, котик отзывается*/

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("кот", "Василий","черный", 400, 30, "мейн-кун", "длинные");
        Human human = new Human("Иванов", "Иван");

        human.calling((Animal) cat);    // Взаимодействие человека и кота
    }
}
