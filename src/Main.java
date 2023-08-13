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
    }
}