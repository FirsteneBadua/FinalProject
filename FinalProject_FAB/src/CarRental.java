/**
 * The CarRental class represents a rental of a car for a specific period of time.
 */
public class CarRental<T extends Car> {
	private T car;
	private RentalPeriod rentalPeriod;

	/**
	 * Constructs a CarRental object with a given car and rental period.
	 * 
	 * @param car           The car to be rented.
	 * @param rentalPeriod  The rental period of the car.
	 */
	public CarRental(T car, RentalPeriod rentalPeriod) {
		this.car = car;
		this.rentalPeriod = rentalPeriod;
	}

	/**
	 * Calculates the total price of the rental with tax.
	 * 
	 * @return The total price with tax.
	 */
	public double calculateTaxedTotalPrice() {
		int rentalDays = rentalPeriod.getRentalDays();
		double pricePerDay = car.getPricePerDay();
		double taxedPrice = (pricePerDay * rentalDays * 0.06) + pricePerDay * rentalDays;
		return taxedPrice;
	}

	/**
	 * Calculates the total price of the rental without tax.
	 * 
	 * @return The total price without tax.
	 */
	public double calculateTotalPrice() {
		int rentalDays = rentalPeriod.getRentalDays();
		double pricePerDay = car.getPricePerDay();
		return pricePerDay * rentalDays;
	}

	/**
	 * Returns a string representation of the rental details.
	 * 
	 * @return A string representation of the rental details.
	 */
	@Override
	public String toString() {
		return "Rental details:\n" + "Car: " + car + "\nRental period: " + rentalPeriod.getStartDate() + " to "
				+ rentalPeriod.getEndDate() + "\nDuration: " + rentalPeriod.getRentalDays() + " days"
				+ "\nTotal price: $" + calculateTotalPrice();
	}
}
