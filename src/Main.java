public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Задача № 1");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");

        }
        System.out.println("Задача № 2");
        short clientDeviceYear = 2011;
        if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        System.out.println("Задача № 3");
        int year = 1939;

        if (year > 1584) if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        else {
            System.out.println("Год должен быть больше 1584.");

        }

        System.out.println("Задача № 4");
        byte deliveryDistance = 95;
        byte oneDay = 1;
        byte twoDay = 2;
        byte freeDay = 3;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется " + oneDay + " день для доставки вашей карты.");
        } else if
        (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется " + twoDay + " дня для доставки вашей карты.");
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется " + freeDay + " дня для доставки вашей карты.");
        } else if (deliveryDistance > 100) {
            System.out.println("Извините, мы не можем доставить вашу карту.");
        }
        System.out.println("Задача № 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима. Январь месяц.");
                break;
            case 2:
                System.out.println("Зима. Февраль месяц.");
                break;
            case 3:
                System.out.println("Весна. Март месяц.");
                break;
            case 4:
                System.out.println("Весна. Апрель месяц.");
                break;
            case 5:
                System.out.println("Весна. Май месяц.");
                break;
            case 6:
                System.out.println("Лето. Июнь месяц.");
                break;
            case 7:
                System.out.println("Лето. Июль месяц.");
                break;
            case 8:
                System.out.println("Лето. Август месяц.");
                break;
            case 9:
                System.out.println("Осень. Сентябрь месяц.");
                break;
            case 10:
                System.out.println("Осень. Октябрь месяц.");
                break;
            case 11:
                System.out.println("Осень. Ноябрь месяц.");
                break;
            case 12:
                System.out.println("Зима. Декабрь месяц.");
                break;
            default:
                System.out.println("Такого месяца нет.");

        }

    }
}





