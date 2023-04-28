import java.util.Scanner;

public class CarRentalApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Vehicle sedan1 = new Vehicle("Mercedes-Benz", "S500", "White", 2023, 5, 85.0, "sedan");
		Vehicle sedan2 = new Vehicle("BMW", "M3 Competition", "Black", 2022, 5, 120.0, "sedan");
		Vehicle sedan3 = new Vehicle("Audi", "A8", "Grey", 2020, 5, 95.0, "sedan");
		Vehicle sedan4 = new Vehicle("Lexus", "LS", "White", 2019, 5, 100.0, "sedan");
		Vehicle sedan5 = new Vehicle("Genesis", "G90", "Blue", 2022, 5, 80.0, "sedan");
		Vehicle sedan6 = new Vehicle("Porsche", "Panamera", "Red", 2018, 5, 135.0, "sedan");

		Vehicle coupe1 = new Vehicle("BMW", "M4", "Black", 2022, 4, 175.0, "coupe");
		Vehicle coupe2 = new Vehicle("Ford", "GT", "Red", 2017, 2, 250.0, "coupe");
		Vehicle coupe3 = new Vehicle("Lexus", "LC 500", "White", 2019, 4, 225.0, "coupe");
		Vehicle coupe4 = new Vehicle("Ferrari", "812 GTS", "Red", 2022, 2, 300.0, "coupe");
		Vehicle coupe5 = new Vehicle("Dodge", "Challenger", "Purple", 2020, 4, 150.0, "coupe");
		Vehicle coupe6 = new Vehicle("Chevrolet", "Corvette", "Red", 2020, 2, 220.0, "coupe");

		Vehicle suv1 = new Vehicle("Audi", "Q7", "Red", 2023, 7, 200.0, "suv");
		Vehicle suv2 = new Vehicle("BMW", "X5", "Black", 2022, 5, 180.0, "suv");
		Vehicle suv3 = new Vehicle("Mercedes-Benz", "G-Wagon", "Blue", 2022, 5, 185.0, "suv");
		Vehicle suv4 = new Vehicle("Range Rover", "Velar", "Silver", 2022, 5, 190.0, "suv");
		Vehicle suv5 = new Vehicle("Porsche", "Cayenne", "Black", 2020, 5, 250.0, "suv");
		Vehicle suv6 = new Vehicle("Volvo", "XC90", "Blue", 2020, 7, 180.0, "suv");

		System.out.println("Welcome to Rent-A-Regalia");
		System.out.println("Experience regal comfort on the road with Rent-A-Regalia");
		System.out.println("----------------------");
		System.out.println("Available car types: ");
		System.out.println("1. Sedan");
		System.out.println("2. Coupe");
		System.out.println("3. SUV");
		System.out.println("Press 0 to exit");
		System.out.print("Enter car type choice (1-3): ");

		int carTypeChoice;
		if (scanner.hasNextInt()) {
			carTypeChoice = scanner.nextInt();
		} else {
			System.out.println("Invalid choice, exiting program.");
			scanner.close();
			return;
		}

		Vehicle selectedVehicle = null;
		String carType;
		switch (carTypeChoice) {
		case 1:
			carType = "Sedan";
			System.out.println("Available sedan models: ");
			System.out.println("1. " + sedan1);
			System.out.println("2. " + sedan2);
			System.out.println("3. " + sedan3);
			System.out.println("4. " + sedan4);
			System.out.println("5. " + sedan5);
			System.out.println("6. " + sedan6);
			System.out.println("Press 0 to exit");
			System.out.print("Enter sedan model choice (1-6): ");
			int sedanChoice;
			if (scanner.hasNextInt()) {
				sedanChoice = scanner.nextInt();
			} else {
				System.out.println("Invalid choice, exiting program.");
				scanner.close();
				return;
			}
			switch (sedanChoice) {
			case 1:
				selectedVehicle = sedan1;
				break;
			case 2:
				selectedVehicle = sedan2;
				break;
			case 3:
				selectedVehicle = sedan3;
				break;
			case 4:
				selectedVehicle = sedan4;
				break;
			case 5:
				selectedVehicle = sedan5;
				break;
			case 6:
				selectedVehicle = sedan6;
				break;
			case 0:
				System.out.println("Exiting program.");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice, exiting program.");
				scanner.close();
				return;
			}
			break;
		case 2:
			carType = "Coupe";
			System.out.println("Available coupe models: ");
			System.out.println("1. " + coupe1);
			System.out.println("2. " + coupe2);
			System.out.println("3. " + coupe3);
			System.out.println("4. " + coupe4);
			System.out.println("5. " + coupe5);
			System.out.println("6. " + coupe6);
			System.out.println("Press 0 to exit");
			System.out.print("Enter coupe model choice (1-6): ");
			int coupeChoice;
			if (scanner.hasNextInt()) {
				coupeChoice = scanner.nextInt();
			} else {
				System.out.println("Invalid choice, exiting program.");
				scanner.close();
				return;
			}
			switch (coupeChoice) {
			case 1:
				selectedVehicle = coupe1;
				break;
			case 2:
				selectedVehicle = coupe2;
				break;
			case 3:
				selectedVehicle = coupe3;
				break;
			case 4:
				selectedVehicle = coupe4;
				break;
			case 5:
				selectedVehicle = coupe5;
				break;
			case 6:
				selectedVehicle = coupe6;
				break;
			default:
				System.out.println("Invalid choice, exiting program.");
				scanner.close();
				return;
			}
			break;
		case 3:
			carType = "SUV";
			System.out.println("Available SUV models: ");
			System.out.println("1. " + suv1);
			System.out.println("2. " + suv2);
			System.out.println("3. " + suv3);
			System.out.println("4. " + suv4);
			System.out.println("5. " + suv5);
			System.out.println("6. " + suv6);
			System.out.println("Press 0 to exit");
			System.out.print("Enter SUV model choice (1-6): ");
			int suvChoice;
			if (scanner.hasNextInt()) {
				suvChoice = scanner.nextInt();
			} else {
				System.out.println("Invalid choice, exiting program.");
				scanner.close();
				return;
			}
			switch (suvChoice) {
			case 1:
				selectedVehicle = suv1;
				break;
			case 2:
				selectedVehicle = suv2;
				break;
			case 3:
				selectedVehicle = suv3;
				break;
			case 4:
				selectedVehicle = suv4;
				break;
			case 5:
				selectedVehicle = suv5;
				break;
			case 6:
				selectedVehicle = suv6;
				break;
			case 0:
				System.out.println("Exiting program.");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice, exiting program.");
				scanner.close();
				return;
			}
			break;
		default:
			System.out.println("Invalid choice, exiting program.");
			scanner.close();
			return;
		}

		System.out.print("Enter number of rental days: ");
		int rentalDays;
		if (scanner.hasNextInt()) {
			rentalDays = scanner.nextInt();
		} else {
			System.out.println("Invalid input, exiting program.");
			scanner.close();
			return;
		}

		double rentalCost = rentalDays * selectedVehicle.getPricePerDay();
		double taxAmount = rentalCost * 0.06;
		double totalPrice = rentalCost + taxAmount;

		System.out.println("\nRental Summary:");
		System.out.println("Car Type: " + carType);
		System.out.println("Selected Make: " + selectedVehicle.getMake());
		System.out.println("Selected Model: " + selectedVehicle.getModel());
		System.out.println("Price per day: $" + selectedVehicle.getPricePerDay());
		System.out.println("Rental days: " + rentalDays);
		System.out.println("Rental cost: $" + rentalCost);
		System.out.println("Tax (" + (0.06 * 100) + "%): $" + taxAmount);
		System.out.println("Total cost: $" + totalPrice);
		System.out.println("We appreciate your business and hope you had a wonderful rental experience. " );
		System.out.println("Thank you for choosing our company and we look forward to serving you again in the future. " );

		scanner.close();
	}

}
