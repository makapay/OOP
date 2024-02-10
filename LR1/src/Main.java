import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        double x = input.nextDouble();

        double a = 7.1;
        double b = 1.8;

        double y = Math.cos(a * x) + b;

        System.out.println("Значение функции y = cos(ax) + b при x = " + x + " равно " + y);
    }
}