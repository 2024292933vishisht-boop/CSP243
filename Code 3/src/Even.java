import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a = scanner.nextInt();
		if(a%2==0) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
}
