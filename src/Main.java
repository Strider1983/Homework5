public class Main {
    public static void main(String[] args) {
        System.out.println("Условные переменные. Урок2");
        System.out.println("--------------------------");
        System.out.println("Задача №1. Вапиант 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("--------------------------");
        System.out.println("Задача №1. Вариант 2");
        int cliOS = 1;
        if (cliOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (cliOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Операционная система не выбрана");
        }
        System.out.println("--------------------------");
        System.out.println("Задача №2");
        int clientDeviceOS = 1;
        int clientDeviceYear = 2016;
        if (clientDeviceOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("--------------------------");
        System.out.println("Задача №3");
        int year = 2016;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("--------------------------");
        System.out.println("Задача №4");
        int deliveryDistance = 74;
        int deliveryTime = 1;
        if (deliveryDistance <20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if(deliveryDistance <60) {
            System.out.println("Потребуется дней: " + (deliveryTime +1));
        } else if (deliveryDistance <=100) {
            System.out.println("Потребуется дней: " + (deliveryTime +2));
        } else {
            System.out.println("Доставки нет.");
        }
    }
}