package sept2;
import aug19.ArrMethod;
import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		ArrMethod obj2=new ArrMethod();
		Swap obj=new Swap();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int[] numbers = obj2.createArray(scanner.nextInt());
	}
}
