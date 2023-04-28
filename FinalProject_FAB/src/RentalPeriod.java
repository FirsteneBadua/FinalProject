import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 
 * A class that represents a rental period for a vehicle.
 * 
 * @param <T> a type parameter that extends the Vehicle class
 */
public class RentalPeriod<T extends Vehicle> {
	private T vehicle;
	private LocalDate startDate;
	private LocalDate endDate;
	private int rentalDays;
	private double rentalCost;

	/**
	 * 
	 * Constructs a RentalPeriod with the specified vehicle, start date, and end
	 * date. The rentalDays and rentalCost are automatically calculated based on the
	 * start and end dates and the vehicle's daily rental rate.
	 * 
	 * @param vehicle   the vehicle being rented
	 * @param startDate the start date of the rental period
	 * @param endDate   the end date of the rental period
	 */
	public RentalPeriod(T vehicle, LocalDate startDate, LocalDate endDate) {
		this.vehicle = vehicle;
		this.startDate = startDate;
		this.endDate = endDate;
		this.rentalDays = (int) ChronoUnit.DAYS.between(startDate, endDate);
		this.rentalCost = vehicle.getDailyRate() * rentalDays;
	}

	/**
	 * 
	 * Returns the vehicle being rented.
	 * 
	 * @return the vehicle being rented
	 */
	public T getVehicle() {
		return vehicle;
	}

	/**
	 * 
	 * Returns the start date of the rental period.
	 * 
	 * @return the start date of the rental period
	 */
	public LocalDate getStartDate() {
		return startDate;
	}

	/**
	 * 
	 * Returns the end date of the rental period.
	 * 
	 * @return the end date of the rental period
	 */
	public LocalDate getEndDate() {
		return endDate;
	}

	/**
	 * 
	 * Returns the number of days in the rental period.
	 * 
	 * @return the number of days in the rental period
	 */
	public int getRentalDays() {
		return rentalDays;
	}

	/**
	 * 
	 * Returns the total rental cost for the rental period.
	 * 
	 * @return the total rental cost for the rental period
	 */
	public double getRentalCost() {
		return rentalCost;
	}

	/**
	 * 
	 * Returns a String representation of the rental period.
	 * 
	 * @return a String representation of the rental period
	 */
	@Override
	public String toString() {
		return "RentalPeriod{" + "vehicle=" + vehicle + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", rentalDays=" + rentalDays + ", rentalCost=" + rentalCost + '}';
	}
}