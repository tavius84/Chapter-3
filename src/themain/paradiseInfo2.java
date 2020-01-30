package themain;

import java.util.Scanner;
//Tavius Sterling
//This is mine 
public class paradiseInfo2 {
	public static void main(String[] args) {
		double price;
		double discount;
		double savings;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter cutoff price for discount >>> ");
		price = input.nextDouble();
		System.out.print("Enter discount rate as a whole number >>> ");
		discount = input.nextDouble();
		displayInfo(); 
		savings = computeDiscountInfo(price, discount); 
		System.out.print("Special this week on any service over " + price + "$");
		System.out.print(" Discount of " + discount + " percent");
		System.out.print(" That's savings of at least $ " + savings);
	}
	public static double computeDiscountInfo(double pr, double dscnt) {
		double savings;
		savings = pr * dscnt / 100;
		return savings;
	}
	public static void displayInfo() {
		System.out.println("Paradise Day spa wants to pamper you.");
		System.out.println("We will make you look good!");
	}
}
