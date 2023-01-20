package Task1;

import java.util.ArrayList;

class Human implements InterfaceTree {
    private String lastName;    // Фамилия
    private String firstName;   // Имя
    private String secondName;  // Отчество
    private int yearOfBirth;    // Год рождения
    private int gender;         // 0 - женский пол; 1 - мужской пол;
    private Human mother;       // Мать
    private Human father;       // Отец
    private ArrayList<Human> children = new ArrayList<>();     // Дети
    private static ArrayList<Human> humanArrayList = new ArrayList<>(); // Список экземпляров класса

    public Human(String lastName, String firstName, String secondName, int yearOfBirth, int gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        humanArrayList.add(this);
    }

    public Human(String lastName, String firstName, String secondName, int yearOfBirth, int gender,
                 Human mother, Human father) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
        humanArrayList.add(this);
    }

    public Human(String lastName, String firstName, String secondName, int yearOfBirth, int gender,
                 Human mother, Human father, ArrayList<Human> children) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
        humanArrayList.add(this);
        for (Human ch : children) {
            this.children.add(ch);
        }
    }

    public static ArrayList<Human> getHumanArrayList() {
        return humanArrayList;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    @Override
    public StringBuilder getChildren() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.children.size(); i++) {
            sb.append(i + 1 + " ребенок: " + this.children.get(i));
        }
        return sb;
    }

    @Override
    public void setChildren(Human... children) {
        for (Human ch : children) {
            this.children.add(ch);
            if (this.gender == 0) {
                ch.setMother(this);
            }
            if (this.gender == 1) {
                ch.setFather(this);
            }
        }
        if (this.gender != 0 && this.gender != 1) {
            System.out.println("Проверь значение поля getter у экземпляра класса: " + this);
        }
    }

    @Override
    public String toString() {
        return lastName + ' ' + firstName + ' ' + secondName + ' ' + yearOfBirth + " г.р.\n";
    }
}
