/**
 * 
 * A subclass of Car that represents a generic vehicle.
 */
public class Vehicle extends Car {
	int pricePerDay;

	/**
	 * 
	 * Constructs a Vehicle with the specified make, model, color, year, seats,
	 * price per day, and type.
	 * 
	 * @param make        the make of the vehicle
	 * @param model       the model of the vehicle
	 * @param color       the color of the vehicle
	 * @param year        the year the vehicle was made
	 * @param seats       the number of seats in the vehicle
	 * @param pricePerDay the rental price per day of the vehicle
	 * @param type        the type of the vehicle
	 */
	public Vehicle(String make, String model, String color, int year, int seats, double pricePerDay, String type) {
		super(make, model, color, year, seats, pricePerDay);
	}

	/**
	 * 
	 * Returns the rental price per day of the vehicle.
	 * 
	 * @return the rental price per day of the vehicle
	 */
	public double getDailyRate() {
		return pricePerDay;
	}
}