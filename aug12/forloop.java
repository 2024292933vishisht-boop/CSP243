package aug12;

import java.util.Scanner;
class NewClass{
	public static void division(int num , int lower_bound , int higher_bound) {
		for(int i = lower_bound; i < higher_bound; i++) {
			if(i%num == 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.println();
	}
}

public class forloop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Lower bound:");
		int lower_bound = scanner.nextInt();
		System.out.println("Enter Higher bound:");
		int higher_bound = scanner.nextInt();
		System.out.println("How many numbers do you want to divide by?:");
		int no_of_times = scanner.nextInt();
		
		for(int i = 0; i < no_of_times ; i++) {
			System.out.println("Enter the number to check:");
			int num = scanner.nextInt();
			NewClass.division(num , lower_bound , higher_bound);
		}
	}
}
