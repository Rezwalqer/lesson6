import java.util.Scanner;

public class Main {
    public static String checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return year + " год является високосным";
        } else {
            return year + " год не является високосным";
        }
    }

    public static int scanInput() {
        Scanner sc = new Scanner(System.in);
        int checking = sc.nextInt();
        return checking;
    }

    public static String checkDelivery(int distance) {
        if (distance <= 20) {
            return "Доставка займет сутки.";
        } else if (distance <= 60) {
            return "Доставка займет двое суток.";
        } else if (distance <= 100) {
            return "Доставка займет трое суток.";
        } else return "Доставки нет.";
    }

    public static String recommendVersion(int oSystem, int yearVersion) {
        String version = "";
        if (yearVersion < 2022) {
            version = "облегченную ";
        } else if (yearVersion == 2022) {
            version = "";
        }
        if (oSystem == 1) {
            return "Установите " + version + "версию приложения для Android";
        } else if (oSystem == 0) {
            return "Установите " + version + " версию приложения для IOS";
        }
        return version;
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1:");
        System.out.println("Введите год");
        int result = scanInput();
        System.out.println(checkYear(result));

    }

    public static void task2() {
        System.out.println("Задача 2:");
        System.out.println("Ваша версия ОС: 1 - Android. 0 - IOS:");
        int oSystem = scanInput();
        System.out.println("Год выпуска телефона:");
        int yearVersion = scanInput();
        System.out.println(recommendVersion(oSystem, yearVersion));
    }

    public static void task3() {
        System.out.println("Введите расстояние от магазина:");
        int distance = scanInput();
        System.out.println(checkDelivery(distance));
    }
}

