class Calculator {
   
    private double add(double a, double b) {
        return a + b;
    }

    private double subtract(double a, double b) {
        return a - b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }

    private double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
 
    public double performOperation(String operation, double a, double b) {
        
        switch(operation) {
            case "add":
                return add(a, b);
            case "subtract":
                return subtract(a, b);
            case "multiply":
                return multiply(a, b);
            case "divide":
                return divide(a, b);
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }

    public static void main(String[] args) {
        
        Calculator c1 = new Calculator();

        try {
      
            System.out.println("Addition: " + c1.performOperation("add", 5, 3));
 
            System.out.println("Subtraction: " + c1.performOperation("subtract", 5, 3));
            
             
            System.out.println("Multiplication: " + c1.performOperation("multiply", 5, 3));
         
            System.out.println("Division: " + c1.performOperation("divide", 10, 2));
            
         
            System.out.println("Division: " + c1.performOperation("divide", 10, 0));
       
        } catch (ArithmeticException e) {
  
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
       
            System.out.println("Error: " + e.getMessage());
        }
    }
}
