package car_dealership;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Employee {
	
	private String name;
	private int employeeID;
	private NumberFormat df = new DecimalFormat("#.00");
	
	public Employee(String name) {
		this.name = name;
		this.employeeID = setEmployeeID();
	}
	
	public void setName(String name) {
		this.name = name;
	}

	private int setEmployeeID() {
		// employee id self generating 6 digit number
		int employeeId =  (int) (Math.random() * Math.pow(10, 4));
		return employeeId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	@Override
	public String toString() {
		return "Employee Name: " + name + 
				"\nEmployee ID: " + employeeID;
	}

	public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {
		if (finance) {
			double loanAmount = vehicle.getPrice() - customer.getDeposit();
			runCreditHistory(customer, loanAmount);
			processTransaction(customer, vehicle);			
		} else if (vehicle.getPrice() <= customer.getDeposit()) {
			processTransaction(customer, vehicle);
		} else {
			System.out.println("You do not have the money to purchase this car");
		}
	}
	
	public void runCreditHistory(Customer customer, double loanAmount) {
		System.out.println("Customer: " + customer.getName() +
				" has been approved a loan for €" + df.format(loanAmount));
	}
	
	public void processTransaction(Customer customer, Vehicle vehicle) {
		System.out.println("Thank you " + customer.getName() + " for the purchase of: \n" + 
				vehicle);
	}
}
