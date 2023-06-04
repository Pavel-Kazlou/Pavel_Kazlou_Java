package by.aston.exem_tasks;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        TaskTwo.nameCheck();
    }

    private static void nameCheck() {

        String name = "Вячеслав";
        String greetings = "Привет";
        String wrong = "Нет такого имени. Попробуйте снова";

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String consoleName = sc.next();

        if (consoleName.equals(name)) {
            System.out.println(greetings + ", " + consoleName);
        } else {
            System.out.println(wrong);
            TaskTwo.nameCheck();
        }
    }
}