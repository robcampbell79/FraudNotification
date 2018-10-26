package rob.notify;

import java.util.Arrays;
import java.util.Scanner;

public class FraudNotification {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of days and number of trailing days: ");
		
		int days = sc.nextInt();
		int trlDays = sc.nextInt();
		
		int arr[] = new int[days];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Enter day " + (i+1) + ": ");
			int day = sc.nextInt();
			arr[i] = day;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
