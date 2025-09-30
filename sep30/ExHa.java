package sep30;
import java.util.*;

public class ExHa {
	public static void main(String abc[]){
		System.out.println("Enter number to divide by: ");
		Scanner scanner=new Scanner(System.in);
		int a = scanner.nextInt();
		String d[] = new String[1];
		d[0] = "a";
		try{
			int b = 10/a;
		}
		catch(Exception e){
			System.out.println("Divide by Zero");
			ExHa.main(d);
		}
	}
}
