package Test;

import java.time.LocalDate;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

    }
}