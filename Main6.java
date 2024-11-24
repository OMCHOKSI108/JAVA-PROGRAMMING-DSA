class OrderProcessor extends Thread {
    private String orderName;
    private int[] itemPrices;
    private static int totalOrdersProcessed = 0;

    public OrderProcessor(String orderName, int[] itemPrices) {
        this.orderName = orderName;
        this.itemPrices = itemPrices;
    }

    @Override
    public void run() {
        try {
            int totalPrice = 0;
            for (int price : itemPrices) {
                if (price < 0) {
                    throw new IllegalArgumentException("Item price cannot be negative: " + price);
                }
                totalPrice += price;
            }
            synchronized (OrderProcessor.class) {
                totalOrdersProcessed++;
            }
            System.out.println(orderName + " Total: " + totalPrice);
        } catch (Exception e) {
            System.out.println("Error processing " + orderName + ": " + e.getMessage());
        }
    }

    public static int getTotalOrdersProcessed() {
        return totalOrdersProcessed;
    }
}

public class Main6 {
    public static void main(String[] args) {
        int[] order1 = {200, 300, 150};
        int[] order2 = {100, 250};

        OrderProcessor o1 = new OrderProcessor("Order 1", order1);
        OrderProcessor o2 = new OrderProcessor("Order 2", order2);

        o1.start();
        o2.start();

        try {
            o1.join();
            o2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("Total orders processed: " + OrderProcessor.getTotalOrdersProcessed());
    }
}
