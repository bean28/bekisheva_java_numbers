package ru.astondevs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число a: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое число b: ");
        int b = scanner.nextInt();
        int result = NumberOperations.compare(a, b);
        if (result == -1) {
            System.out.println("a < b");
        } else if (result == 0) {
            System.out.println("a = b");
        } else {
            System.out.println("a > b");
        }
        System.out.println("Сумма чисел - " + NumberOperations.sum(a,b));
        System.out.println("Разность чисел - " + NumberOperations.subtraction(a,b));
        System.out.println("Произведение чисел - " + NumberOperations.multiply(a,b));
        System.out.println("Частное чисел - " + NumberOperations.division(a,b));
    }
}
