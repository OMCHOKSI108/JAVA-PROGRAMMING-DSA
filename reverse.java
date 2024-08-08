/*if you want to take / access / store a last digit of any 
natural number you need to use (n%10) statement and to remove
last digit you need to use (n=n/10) / */
public class reverse {
    public static void main(String[] args) {
        int n = 196542;
      while (n>0) { 
             System.out.print(n%10);
             n=n/10;
      }

    }
}
