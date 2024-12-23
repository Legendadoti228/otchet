import java.util.Scanner;

public class Zadacha1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введити числа (4 штуки): ");
        int a = scanner.nextInt();

        System.out.println();
        int b = scanner.nextInt();

        System.out.println();
        int c = scanner.nextInt();

        System.out.println();
        int d = scanner.nextInt();

        int max = maksimum(a, b, c, d);

        System.out.println("Max из 4 чисел: " + max);
    }


    public static int maksimum(int a, int b, int c, int d) {

        int max1 = Math.max(a, b);

        int max2 = Math.max(c, d);

        return Math.max(max1, max2);
    }
}