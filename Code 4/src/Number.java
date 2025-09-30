import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();
        boolean abc = true;
		if((abc) && (c>b))
			System.out.println(true);
		else if((a<b) && (b<c))
				System.out.println(true);
		else 
			System.out.println(false);
		
	}
}
