import java.util.Scanner;

// Define a basic Car class
class Car {
    // Attributes (fields)
    String brand;
    String color;
    int year;

    // Constructor to initialize the Car's attributes
    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}

// Main class to get user input and display car information
public class CarWithDetails {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for car details
        System.out.print("Enter the car brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter the car color: ");
        String color = scanner.nextLine();

        System.out.print("Enter the car year: ");
        int year = scanner.nextInt();

        // Create a Car object with user-provided details
        Car userCar = new Car(brand, color, year);

        // Display the car information
        userCar.displayInfo();

        // Close the scanner
        scanner.close();
    }
}