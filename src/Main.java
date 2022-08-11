public class Main {
    public static void main(String[] args) {
        //Задание 1
        isYearBissextile(2000);

        //Задание 2
        osMessage(1, 2022);

        //Задание 3
        int delivery = deliveryCalculator(60);
        //System.out.println(delivery);
    }

    private static void isYearBissextile (int year) {
        boolean isYearVisokosni = false;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) isYearVisokosni = true;
        if (isYearVisokosni) {
            System.out.println(year + " — високосный год");
        }
        else {
            System.out.println(year + " — не високосный год");
        }
    }

    private static void osMessage(int clientOS, int clientDeviceYear) {
        int currentYear = 2022;

        if (clientDeviceYear >= currentYear) {
            System.out.print("Установите версию приложения для ");
        }
        else {
            System.out.print("Установите облегченную версию приложения для ");
        }
        if (clientOS == 0) {
            System.out.println("iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Android по ссылке\n");
        }
    }

    private static int deliveryCalculator(int deliveryDistance) {
        int delivery = 1;
        if (deliveryDistance >= 20) {
            delivery += (deliveryDistance - 20)  / 40 + 1;
        }
        return delivery;
    }
}