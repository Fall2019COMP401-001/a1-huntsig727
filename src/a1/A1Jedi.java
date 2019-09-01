package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int totalItems = scan.nextInt();
		
		String[] foodNames = new String[totalItems];
		double[] foodPrices = new double[totalItems];
		
		for (int i = 0; i < totalItems; i++) {
			foodNames[i] = scan.next();
			foodPrices[i] = scan.nextDouble();
		}
		
		int totalCustomers = scan.nextInt();
		
		String[] customerNames = new String[totalCustomers];
		int[] numberOfItems = new int[totalCustomers];
		
		int[] amountsOfEachFood = new int[foodNames.length];
		int[] numberOfPplEachFood = new int[foodNames.length];
		
		for (int i = 0; i < totalCustomers; i++) {
			customerNames[i] = scan.next() + scan.next();
			numberOfItems[i] = scan.nextInt();
			
			int[] numberOfEach = new int[numberOfItems[i]];
			String[] nameOfItems = new String[numberOfItems[i]];
				
			for (int j = 0; j < numberOfItems[i]; j++) {
					numberOfEach[j] = scan.nextInt();
					nameOfItems[j] = scan.next();
					
			}	
			
			for (int y = 0; y < nameOfItems.length; y++) {
				for (int w = 0; w < foodNames.length; w++) {
					if (foodNames[w].equals(nameOfItems[y])) {
						amountsOfEachFood[w] += numberOfEach[y];
					}
				}
		}	
			for (int y = 0; y < nameOfItems.length; y++) {
				for (int w = 0; w < foodNames.length; w++) {
					if (foodNames[w].equals(nameOfItems[y])) {	
						numberOfPplEachFood[w]++;
					}
					for (int k = foodNames.length - 1; k > foodNames.length; k--) {
						if (nameOfItems[y].equals(nameOfItems[k]) & k != y) {
							numberOfPplEachFood[w]--;
						}
					
				}
			
				
			}
		}
		}
		for (int i = 0; i < amountsOfEachFood.length; i++) {
			if (amountsOfEachFood[i] == 0) {
				System.out.println("No customers bought " + foodNames[i]);
			} else {
				System.out.println(numberOfPplEachFood[i] + " customers bought " + amountsOfEachFood[i] + " " + foodNames[i]);
			}
		}
		}
	}
					
					
//			for (int z = 0; z < foodNames.length; z++) {
//				
//					
//				total = totalNumberOfPeople(foodNames[z], nameOfItems);
//				numberOfFoods = totalNumberOfItems(foodNames[z], numberOfEach, nameOfItems);
//							
//				
//			if (total == 0) {
//				System.out.println("No customers bought " + foodNames[z]);
//			} else {
//				System.out.println(total + " customers bought " + numberOfFoods + " " + foodNames[z]);
//			}
//			}	
//		}
	
//	public static int totalNumberOfItems(String a, int[] b, String[] c) {
//		int x = 0;
//		for (int i = 0; i < b.length; i++) {
//			if (a.equals(c[i])){
//				x += b[i];
//			}
//		}
//		return x;
//	}
//	public static int totalNumberOfPeople(String a, String[] c) {
//		int y = 0;
//		for (int i = 0; i < c.length; i++) {
//			if (a.equals(c[i])) {
//				y += 1;
//			}
//		}
//		return y;
//	}
//}
