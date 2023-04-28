/**
 * 
 * The Car class represents a car with its make, model, year, seats, color and
 * price per day.
 */
public abstract class Car {
	private String make;
	private String model;
	private int year;
	private int seats;
	private double pricePerDay;
	private String color;

	/**
	 * 
	 * Creates a new car with the given make, model, color, year, seats, and price
	 * per day.
	 * 
	 * @param make        the make of the car
	 * @param model       the model of the car
	 * @param color       the color of the car
	 * @param year        the year of the car
	 * @param seats       the number of seats in the car
	 * @param pricePerDay the rental price per day of the car
	 */
	public Car(String make, String model, String color, int year, int seats, double pricePerDay) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.seats = seats;
		this.pricePerDay = pricePerDay;
		this.color = color;
	}

	/**
	 * 
	 * Returns the make of the car.
	 * 
	 * @return the make of the car
	 */
	public String getMake() {
		return make;
	}

	/**
	 * 
	 * Sets the make of the car.
	 * 
	 * @param make the make of the car to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * 
	 * Returns the model of the car.
	 * 
	 * @return the model of the car
	 */
	public String getModel() {
		return model;
	}

	/**
	 * 
	 * Sets the model of the car.
	 * 
	 * @param model the model of the car to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * 
	 * Sets the color of the car.
	 * 
	 * @param color the color of the car to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * 
	 * Returns the year of the car.
	 * 
	 * @return the year of the car
	 */
	public int getYear() {
		return year;
	}

	/**
	 * 
	 * Sets the year of the car.
	 * 
	 * @param year the year of the car to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * 
	 * Returns the number of seats in the car.
	 * 
	 * @return the number of seats in the car
	 */
	public int getSeats() {
		return seats;
	}

	/**
	 * 
	 * Returns the color of the car.
	 * 
	 * @return the color of the car
	 */
	public String getColor() {
		return color;
	}

	/**
	 * 
	 * Sets the number of seats in the car.
	 * 
	 * @param seats the number of seats in the car to set
	 */
	public void setSeats(int seats) {
		this.seats = seats;
	}

	/**
	 * 
	 * Returns the rental price per day of the car.
	 * 
	 * @return the rental price per day of the car
	 */
	public double getPricePerDay() {
		return pricePerDay;
	}

	/**
	 * Sets the rental price per day of the car.
	 * 
	 * @param pricePerDay the rental price per day of the car to set
	 */
	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	/**
	 * Returns a String representation of the car.
	 * 
	 * @return a String representation of the car
	 */
	public String toString() {
		return color + " " + make + " " + model + " (" + year + ") " + seats + " seats $" + pricePerDay + " per day";
	}
}