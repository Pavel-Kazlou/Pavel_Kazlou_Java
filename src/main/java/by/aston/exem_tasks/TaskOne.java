package by.aston.exem_tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        TaskOne.numberCheck();
    }

    private static void numberCheck() {

        String greetings = "Привет!";
        String wrongNumber = "Число не соответствует требованиям. Попробуйте снова!";
        String notNumber = "Введено не числовое значение.";

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите число: ");
            int num = sc.nextInt();

            if (num > 7) {
                System.out.println(greetings);
            } else {
                System.out.println(wrongNumber);
                TaskOne.numberCheck();
            }
        } catch (InputMismatchException e) {
            System.err.println(notNumber);
        }
    }
}


