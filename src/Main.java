import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        yearsVisokos(stringYearsVisokos());
        getClientOS(stringClientOS());
        predDost(stringPredDost());
    }

    private static int stringYearsVisokos() {
        System.out.println("Введите год:");
        Scanner in = new Scanner(System.in);
        int years = in.nextInt();
        return years;
    }

    private static void yearsVisokos(int years) {
        if (years >= 1584) {
            if ((years % 4 == 0) && (years % 100 != 0) || (years % 400 == 0)) {
                System.out.println(years + " год является високосным");
            } else {
                System.out.println(years + " год не является високосным");
            }
        } else {
            System.out.println("Год должен быть больше 1583");
        }
    }

    private static int stringClientOS() {
        System.out.println("Задание 1, 2: введите число 0 — iOS, 1 — Android");
        Scanner in = new Scanner(System.in);
        int clientOS = in.nextInt();
        return clientOS;
    }

    private static void getClientOS(int clientOS) {
        Scanner in = new Scanner(System.in);
        switch (clientOS) {
            case 0:
                System.out.println("Введите год выпуска телефона:");
                int clientDeviceYear = in.nextInt();
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                System.out.println("Введите год выпуска телефона:");
                int clientDeviceYear1 = in.nextInt();
                if (clientDeviceYear1 >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
        }
    }

    private static int stringPredDost() {
        System.out.println("Сколько до вас КМ");
        Scanner in = new Scanner(System.in);
        int deliveryDistance = in.nextInt();
        return deliveryDistance;
    }

    private static void predDost(int deliveryDistance) {
        if (deliveryDistance >= 0 && deliveryDistance <= 19) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км занимает сутки");
        }
        if (deliveryDistance >= 20 && deliveryDistance <= 59) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км занимает 2 дня");
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 99) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км занимает 3 дня");
        }
        if (deliveryDistance >= 100) {
            System.out.println("Доставки нет");
        }
    }
}