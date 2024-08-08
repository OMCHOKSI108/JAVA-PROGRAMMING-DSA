/*Unary Operator Use
Post Increment and Pre Increment
      < a++ >   |    < ++a > 
*/
class unary_operator {
   public static void main(String args[]){
    int a = 10;
    int b = ++a;   //pre increment
    System.out.println(a + "\n" + b);

    int c = 30;
    int d = c++;  //
     System.out.println(c + "\n" + d);
   }    

}