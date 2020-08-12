package car_dealership;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Vehicle  {

	private String make;
	private String model;
	private double price;
	private NumberFormat df = new DecimalFormat("#.00");
	
	public Vehicle(String make, String model, double price) {
		this.make = make;
		this.model = model;
		this.price = price;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Make of Car: " + make + 
				"\nModel of Car: " + model + 
				"\nPrice of Car: €" + df.format(price);
	}
}
