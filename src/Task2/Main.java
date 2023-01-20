package Task2;

/*Описать с ООП стиле, логику взаимодействия объектов реального мира между собой: шкаф-человек.
Какие члены должны быть у каждого из классов*/
public class Main {
    public static void main(String[] args) {
        Human ivan = new Human("Иванов", "Иван");
        Wardrobe wrd = new Wardrobe("шкаф","IKEA", "дерево", 5000, 50, 200, 50);
        Table tbl = new Table("стол","IKEA", "дерево", 3000, 100);

        ivan.move(wrd);     // Взаимодействие человека и шкафа
        ivan.wipe(tbl);     // Взаимодействие человека и стола
    }
}
