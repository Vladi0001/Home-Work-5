public class Main {
    public static void main(String[] args) {

        //task1 1 - 2
        byte clientOS = 0;
        short clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //task1 3
        short year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
            System.out.println(year + "Год является высокосным.");
        } else {
            System.out.println(year + "Год не является высокосным.");
        }


        //task1 4
        int deliveryDistance = 74;

        if ( deliveryDistance < 20) {
            System.out.println("Потребуется 1 день для доставки.");
        }
        else if ( deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня для доставки.");
        }
        else if ( deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется 3 дня для доставки.");
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
        //task1 5
        byte monthNumber = 4;

        switch (monthNumber ) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }

    }

}