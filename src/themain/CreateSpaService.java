package themain;

import java.util.Scanner;

public class CreateSpaService {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String service;
		double price;
		Spaservice firstService = new Spaservice();
		Spaservice secondService = new Spaservice();
		Scanner input = new Scanner(System.in);
		pl("Enter service >> ");
		service = input.nextLine();
		pl("Enter price >> ");
		price = input.nextDouble();
		firstService.setServiceDescription(service);
		firstService.setPrice(price);
		input.nextLine();
		pl("Enter service >> ");
		service = input.nextLine();
		pl("Enter price >> ");
		price = input.nextDouble();
		secondService.setServiceDescription(service);
		secondService.setPrice(price);
		pl("First service details: ");
		pl(firstService.getServiceDescription() + "$" + firstService.getPrice());
		pl("Second service details: ");
		pl(secondService.getServiceDescription() + "$" + secondService.getPrice());
	}
	private static void pl(String getString) {
		System.out.println(getString);
	}

}
