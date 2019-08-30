package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int totalItems = scan.nextInt();
		
		String[] itemNames = new String[totalItems];
		double[] itemPrices = new double[totalItems];
		
		for (int i = 0; i < totalItems; i++) {
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
		
		int totalCustomers = scan.nextInt();
		
		String[] firstNames = new String[totalCustomers];
		String[] lastNames = new String[totalCustomers];
		int[] numberOfItems = new int[totalCustomers];
		
		String bigSpend = "";
		String smallSpend = "";
		
		double biggestSpender = 0;
		double smallestSpender = 100000;
		double average = 0;
		
	
		
		for (int i = 0; i < totalCustomers; i++) {
			firstNames[i] = scan.next();
			lastNames[i] = scan.next();
			
			numberOfItems[i] = scan.nextInt();
			
			int[] numberOfEach = new int[numberOfItems[i]];
			String[] nameOfItems = new String[numberOfItems[i]];
			
			for (int j = 0; j < numberOfItems[i]; j++) {
				numberOfEach[j] = scan.nextInt();
				nameOfItems[j] = scan.next();
			}
			
			double total = totalSpent(nameOfItems, numberOfEach, itemPrices, itemNames);
			
			if (total > biggestSpender) {
				biggestSpender = total;
				bigSpend = firstNames[i] + " " + lastNames[i];
			}
			
			if (total < smallestSpender) {
				smallestSpender = total; 
				smallSpend = firstNames[i] + " " + lastNames[i];
			}
			
			average += total;

		}	
		
		double averagePrice = average/totalCustomers;
		
		System.out.println("Biggest: " + bigSpend + " (" + String.format("%.2f", biggestSpender) + ")");
		System.out.println("Smallest: " + smallSpend + " (" + String.format("%.2f", smallestSpender) + ")");
		System.out.println("Average: " + String.format("%.2f", averagePrice));
	}
	
	public static double totalSpent(String[] a, int[] b, double[] c, String[] d) {
		double totalCost = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < d.length; j++) {
				if (a[i].equals(d[j])) {
					totalCost += b[i] * c[j];
				}
			}
		}
		
		return totalCost;
	}
}
