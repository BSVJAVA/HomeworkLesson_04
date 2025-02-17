public class Main {
    public static void main(String[] args) {
        // Задача №1
        byte clientOS = 1;     //(0 — iOS, 1 — Android).
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача №2
        clientOS = 0;
        short yearReleas = 2015;
        if (yearReleas < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача №3
        short year = 2010;
        if (year % 4 == 0 ) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задача №4
        short deliveryDistance = 35; // Дистанция до места доставки
        byte days = 0;               // Количество дней доставки
        if (deliveryDistance > 0 && deliveryDistance <= 20) days = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) days = 2;
        if (deliveryDistance > 60 && deliveryDistance <= 100) days = 3;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else System.out.println("Потребуется дней: " + days);

        // Задача №5
        byte monthNumber = 9;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Время года - зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года - весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года - лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года - осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}