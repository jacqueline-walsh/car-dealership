package car_dealership;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Customer {
	
	private String name;
	private String address;
	private double deposit;
	private NumberFormat df = new DecimalFormat("#.00");
	
	public Customer(String name, String address, double deposit) {
		this.name = name;
		this.address = address;
		this.deposit = deposit;
	}
	
	public void setName (String name) {
		this.name = name;
	}

	public void setAddress (String address) {
		this.address = address;
	}

	public void setDeposit (double deposit) {
		this.deposit = deposit;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public double getDeposit() {
		return deposit;
	}
	
	public String toString() {
		return "Name: " + name + 
				"\nAddress: " + address + 
				"\nDeposit: €" + df.format(deposit);
	}
	
	public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance) {
		employee.handleCustomer(this, finance, vehicle);		
	}
}
