import java.util.Scanner;

public class MathOps {
	public void add(int a, int b) {
		 System.out.println("Sum " + (a + b));
	}
	public void sub(int a, int b) {
		System.out.println("Difference "+ (a - b));
	}
	public void  mult(int a, int b) {
		System.out.println("Result " + (a * b));
	}
	public void divide(int a, int b) {
		System.out.println("Quotient " + (a / b));
	}
	public void remain(int a, int b) {
		System.out.println("Remainder " + (a % b));
	}
	public static void main(String[] args) {
		MathOps obj = new MathOps();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int a = scanner.nextInt();
		System.out.println("Enter another integer:");
		int b = scanner.nextInt();
		obj.add(a,  b);
		obj.sub(a, b);
		obj.mult(a, b);
		obj.divide(a, b);
		obj.remain(a, b);
	}
}
