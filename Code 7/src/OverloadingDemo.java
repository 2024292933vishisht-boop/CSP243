import java.util.Scanner;

public class OverloadingDemo {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo();
        System.out.println("sum(int, int) = " + od.sum(3, 4));
        System.out.println("sum(double, double) = " + od.sum(2.5, 4.1));
        System.out.println("sum(int, int, int) = " + od.sum(1, 2, 3));

        // simple demonstration with user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum (overloaded) = " + od.sum(x, y));
    }
}
