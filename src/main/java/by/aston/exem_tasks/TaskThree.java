package by.aston.exem_tasks;

import java.util.*;

public class TaskThree {
    public static void main(String[] args) {
        TaskThree.arrayFactory();
    }

    private static void arrayFactory() {

        int arrSize = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите числом, размер желаемого массива: ");
            arrSize = sc.nextInt();
            if (arrSize == 0) {
                System.out.println("В массиве длинной 0 элементов - нечего проверять. Попробуйте снова!");
                TaskThree.arrayFactory();
            }
        } catch (InputMismatchException e) {
            System.out.println("Введено не числовое значение.");
        }

        try {
            int[] arr = new int[arrSize];

            Random random = new Random();
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = random.nextInt(100);
            }
            if (arr.length > 0) {
                System.out.println("Созданный массив: " + Arrays.toString(arr));
            }
            for (int value : arr) {
                if (value == 0) {
                    System.out.println("В массиве есть ноль, он не кратен ни одному числу");
                } else if (value % 3 == 0) {
                    System.out.println("Число " + value + " кратно трём");
                }
            }
        } catch (NegativeArraySizeException e) {
            System.out.println("Введённое число не должно быть отрицательным");
        }
    }
}



