package aug19;

import java.util.Scanner;

public class ArrMethod {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int arr[] = ArrMethod.createArray(scanner.nextInt());
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] createArray(int n) {
		int arr[] = new int[n];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < n ; i++) {
			System.out.println("Enter "+(i+1)+" element:");
			arr[i] = scanner.nextInt();
		}
		return arr;
	}

}
