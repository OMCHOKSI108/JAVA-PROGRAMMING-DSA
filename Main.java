 // Main class of the program
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Vehicle class
        Vehicle vehicle = new Vehicle("Generic Vehicle", 100);
        vehicle.displayInfo();  // Calling a method to display vehicle info

        // Creating an object of the Car class (subclass of Vehicle)
        Car car = new Car("Sedan", 180, "Toyota", "Camry");
        car.displayInfo();  // Calling overridden method
        car.showCarDetails();  // Calling a subclass-specific method

        // Demonstrating method overloading
        car.start();  // No argument
        car.start(5);  // With an argument

        // Using a static method
        Vehicle.displayVehicleCount();

        // Working with abstract classes
        Bike bike = new Bike("Motorcycle", 150, "Honda", "CBR600RR");
        bike.displayInfo();  // Calling overridden method from abstract class
        bike.displayBikeType();  // Calling subclass-specific method

        // Working with interfaces
        ElectricVehicle tesla = new ElectricVehicle("Electric Car", 250, "Tesla", "Model S");
        tesla.displayInfo();  // Method from Vehicle class
        tesla.chargeBattery();  // Method from Electric interface

        // Using an anonymous class
        Engine engine = new Engine() {
            @Override
            public void startEngine() {
                System.out.println("Starting engine with anonymous class.");
            }
        };
        engine.startEngine();

        // Working with inner classes
        Car.Engine carEngine = car.new Engine();
        carEngine.startEngine();  // Calling inner class method
    }
}

// Base class
class Vehicle {
    private String type;
    private int maxSpeed;
    private static int vehicleCount = 0;  // Static variable to keep track of the number of vehicles

    // Constructor
    public Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
        vehicleCount++;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Method to display information about the vehicle
    public void displayInfo() {
        System.out.println("Vehicle Type: " + type);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }

    // Static method to display the number of vehicles created
    public static void displayVehicleCount() {
        System.out.println("Total number of vehicles: " + vehicleCount);
    }
}

// Subclass that extends Vehicle
class Car extends Vehicle {
    private String brand;
    private String model;

    // Constructor
    public Car(String type, int maxSpeed, String brand, String model) {
        super(type, maxSpeed);  // Calling the superclass constructor
        this.brand = brand;
        this.model = model;
    }

    // Overridden method from the Vehicle class
    @Override
    public void displayInfo() {
        super.displayInfo();  // Calling the superclass method
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    // Method specific to Car class
    public void showCarDetails() {
        System.out.println("This is a " + brand + " " + model + ".");
    }

    // Overloaded method (no parameters)
    public void start() {
        System.out.println("Car is starting...");
    }

    // Overloaded method (with parameters)
    public void start(int delay) {
        System.out.println("Car will start in " + delay + " seconds...");
    }

    // Inner class representing the Engine of a Car
    class Engine {
        public void startEngine() {
            System.out.println("Engine of " + brand + " " + model + " is starting...");
        }
    }
}

// Abstract class
abstract class TwoWheeler extends Vehicle {
    public TwoWheeler(String type, int maxSpeed) {
        super(type, maxSpeed);
    }

    // Abstract method
    public abstract void displayBikeType();
}

// Concrete class that extends the abstract class TwoWheeler
class Bike extends TwoWheeler {
    private String brand;
    private String model;

    // Constructor
    public Bike(String type, int maxSpeed, String brand, String model) {
        super(type, maxSpeed);
        this.brand = brand;
        this.model = model;
    }

    // Overridden method from the Vehicle class
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    // Implementing the abstract method from TwoWheeler
    @Override
    public void displayBikeType() {
        System.out.println("This is a " + brand + " bike, model " + model + ".");
    }
}

// Interface for Electric Vehicles
interface Electric {
    void chargeBattery();
}

// Class implementing an interface
class ElectricVehicle extends Vehicle implements Electric {
    private String brand;
    private String model;

    // Constructor
    public ElectricVehicle(String type, int maxSpeed, String brand, String model) {
        super(type, maxSpeed);
        this.brand = brand;
        this.model = model;
    }

    // Overridden method from Vehicle class
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("This is an electric vehicle.");
    }

    // Implementing the interface method
    @Override
    public void chargeBattery() {
        System.out.println("Charging the battery of " + brand + " " + model + "...");
    }
}

// Interface representing a generic Engine
interface Engine {
    void startEngine();
}
