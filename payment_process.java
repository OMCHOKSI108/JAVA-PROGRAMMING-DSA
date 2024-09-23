 abstract class Pay {
    protected double amt;   
 
    public Pay(double amt) {
        this.amt = amt;
    }
 
    public abstract void processPay();

    
    public abstract String getPayDetails();
}

 
class CreditCardPay extends Pay {
    private String cardNum;

 
    public CreditCardPay(double amt, String cardNum) {
        super(amt);
        this.cardNum = cardNum;
    }

    
    @Override
    public void processPay() {
        System.out.println("Processing Credit Card Payment of $" + amt);
    }
 
    @Override
    public String getPayDetails() {
        return "Credit Card Payment with Card Number: " + cardNum;
    }
}

 
class PayPalPay extends Pay {
    private String email;

    
    public PayPalPay(double amt, String email) {
        super(amt);
        this.email = email;
    }

 
    @Override
    public void processPay() {
        System.out.println("Processing PayPal Payment of $" + amt);
    }

  
    @Override
    public String getPayDetails() {
        return "PayPal Payment to Email: " + email;
    }
}

 
interface Transact {
 
    void execTransact(Pay p);
}
 
class TransactProcessor implements Transact {
   
    @Override
    public void execTransact(Pay p) {
        p.processPay();   
        System.out.println(p.getPayDetails());   
    }
}
 
public class payment_process {
    public static void main(String[] args) {
         
        Pay ccPay = new CreditCardPay(150.00, "1234-5678-9876-5432");
        Pay ppPay = new PayPalPay(200.00, "user@example.com");
 
        TransactProcessor tProc = new TransactProcessor();

         
        System.out.println("Credit Card Payment:");
        tProc.execTransact(ccPay);  

        System.out.println("\nPayPal Payment:");
        tProc.execTransact(ppPay);   
    }
}
