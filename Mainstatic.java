// Base class Shape
class Shape {
    // Method to display area - can be overridden in derived classes
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

// Subclass Triangle that extends Shape
class Triangle extends Shape {
    // Overriding the area method to calculate the area of a triangle
    @Override
    public void area() {
        System.out.println("Calculates area of Triangle");
    }
    
    // Method to calculate area of a triangle with given height and base
    public void area(int h, int b) {
        // Calculating the area of the triangle (1/2 * base * height)
        double area = 0.5 * b * h;
        System.out.println("Area of Triangle: " + area);
    }
}

// Subclass Circle that extends Shape
class Circle extends Shape {
    // Overriding the area method to calculate the area of a circle
    @Override
    public void area() {
        System.out.println("Calculates area of Circle");
    }
    
    // Method to calculate area of a circle with given radius
    public void area(int r) {
        // Calculating the area of the circle (π * radius^2)
        double area = Math.PI * r * r;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class to test the above code
public class Mainstatic {
    public static void main(String[] args) {
        // Creating objects of Triangle and Circle
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        
        // Display area calculation for the Triangle
        triangle.area(); // Calls the overridden area method
        triangle.area(10, 5); // Calls the overloaded area method with height and base
        
        // Display area calculation for the Circle
        circle.area(); // Calls the overridden area method
        circle.area(7); // Calls the overloaded area method with radius
    }
}
