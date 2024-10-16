public class FanControl extends Thread {
    private boolean running;

    // Constructor
    public FanControl() {
        this.running = true; // Set the fan status to running
    }

    // Method to stop the fan
    public void stopFan() {
        running = false;
    }

    // The run method which contains the infinite loop
    @Override
    public void run() {
        while (true) {
            // Simulate fan operation
            try {
                // Simulating fan speed check and running state
                System.out.println("Fan is running at full speed...");
                
                // Simulating some complex logic with sleep
                for (int i = 0; i < 1000000; i++) {
                    // Simulating complex calculations or operations
                    double result = Math.sin(i) * Math.cos(i);
                }
                
                // Delay to simulate periodic checks
                Thread.sleep(100); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Fan control interrupted.");
                running = false; // Stop the loop if interrupted
            }
        }
        //System.out.println("Fan stopped.");
    }

    public static void main(String[] args) {
        FanControl fan = new FanControl(); // Create a new fan control thread
        fan.start(); // Start the fan thread

        // Simulating running for a specific duration (e.g., 5 seconds) for demonstration
        try {
            Thread.sleep(50); // Run the fan for 5 seconds
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // Stop the fan after the specified duration
        fan.stopFan();
        
        // Wait for the fan thread to finish
        try {
            fan.join(); // Wait for the fan thread to complete
        } catch (InterruptedException e) {
            System.out.println("Error waiting for fan thread.");
        }
        
        System.out.println("Main program ended.");
    }
}
