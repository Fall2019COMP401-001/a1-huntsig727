package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int totalCustomers = scan.nextInt();
		
		for (int i = 0; i <= totalCustomers; i++) {
			String[] names;
			names[0] = scan.next();
			names[1] = scan.next();
			
			int items = scan.nextInt();
			
			int[] quantityArray;
			String[] itemNames;		
			double[] priceArray;
			
			for (int j = 0; j <= items; j++) {
				
				quantityArray[j] = scan.nextInt();
				itemNames[j] = scan.next();
				priceArray[j] = scan.nextDouble();
			}
			
			double total = totalPrice(quantityArray, priceArray);
			System.out.println(names[0].charAt(0) + ". " + names[1] + ": " + String.format("%.2f, total"))
			
		}
		
	}
	
	public static double totalPrice(int[] a, double[] b) {
		double totalCost = 0;
		for (int i = 0; i <= a.length; i++) {
			totalCost += a[i] * b[i];
		}
		
		return totalCost;
	}
}
