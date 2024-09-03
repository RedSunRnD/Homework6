public class Main {
    public static void main(String[] args) {
        //Задача №1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        //Задача №2
        for (int a = 10; a > 0; a--) {
            System.out.println(a);
        }
        System.out.println();

        //Задача №3
        for (int b = 0; b < 17; b = b + 2) {
            System.out.println(b);
        }
        System.out.println();

        //Задача №4
        for (int c = 10; c >= -10; c--) {
            System.out.println(c);
        }
        System.out.println();

        //Задача №5
        for (int d = 1904; d <= 2096; d = d + 4) {
            System.out.println(d);
        }
        System.out.println();

        //задача №6
        for (int e = 7; e <= 98; e = e + 7) {
            System.out.println(e);
        }
        System.out.println();

        //Задача №7
        for (int f = 1; f <= 512; f = f * 2) {
            System.out.println(f);
        }
        System.out.println();

        //Задача №8
        int incomeA = 29000;
        int totalA = 0;
        for (int g = 1; g < 12; g++) {
            totalA = totalA + incomeA;
            System.out.println("Месяц " + g + ", сумма накопления равна " + totalA + " рублей.");
        }
        System.out.println();

        //Задача №9
        int incomeB = 29000;
        int totalB = 0;
        for (int h = 1; h < 12; h++) {
            totalB = totalB + totalB/100;
            totalB = totalB + incomeB;
            System.out.println("Месяц " + h + ", сумма накопления равна " + totalB + " рублей.");
        }
        System.out.println();

        //Задача №10
        int result;
        for (int j = 1; j <= 10; j++) {
            result = 2 * j;
            System.out.println("2*" + j + "=" + result);
        }
        System.out.println();
    }
}