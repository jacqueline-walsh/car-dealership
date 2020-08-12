package car_dealership;

import java.util.Scanner;

public class Dealership {

	public static void main(String[] args) {

		boolean finance = false;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = scan.nextLine();


		System.out.println("Please enter your address: ");	
		String address = scan.nextLine();

		System.out.println("Please enter amount of your deposit: ");
		double deposit = scan.nextDouble();

		System.out.println("What is the make of car you wish to purchase: ");
		String make = scan.nextLine();
		scan.nextLine();
		System.out.println("What is the model: ");
		String model = scan.nextLine();

		
		System.out.println("What is the price of the car: ");
		double price = scan.nextDouble();
		scan.nextLine();
		System.out.println("Do you require finance: ");
		String financeRequired = scan.next();
		scan.close();
		if (financeRequired.equalsIgnoreCase("Yes")) {
			finance = true;
		} else if (financeRequired.equalsIgnoreCase("No")) {
			finance = false;
		}
		
		Customer cust = new Customer(name, address, deposit);	
		Employee emp = new Employee("Jane West");
		
		Vehicle car = new Vehicle(make, model, price);

		emp.handleCustomer(cust, finance, car);
	}

}
