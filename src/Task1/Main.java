package Task1;

import static Task1.Human.getHumanArrayList;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Иванова", "Светлана", "Николаевна", 1967, 0);
        Human h2 = new Human("Иванов", "Михаил", "Сергеевич", 1967,1);
        Human h3 = new Human("Иванов", "Илья", "Михайлович", 1989, 1, h1, h2);
        Human h4 = new Human("Иванова", "Виктория", "Ильинична", 2013, 0);
        Human h5 = new Human("Иванов", "Виктор", "Ильич", 2018,1);

        h3.setChildren(h4, h5);                     // Добавление детей + добавление родителя детям
        System.out.println(h3.getChildren());       // Вывод на печать детей
        System.out.println("______________________________");

        System.out.println(h4.getFather());         // Вывод на печать
        System.out.println(h5.getFather());
        System.out.println("______________________________");

        System.out.println(getHumanArrayList());    // Вывод на печать экземпляров класса Human
    }
}
