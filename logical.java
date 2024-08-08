/*logical operator 
 * AND,OR,NOT === &&,||,!
 */
class logical {

    public static void main(String[] args) {
        System.out.println((3 > 2) && (5 > 2)); //True && True = True
        System.out.println((3 < 2) && (5 > 2)); //False && True = False
        System.out.println((3 > 2) || (5 > 2)); //True || True = True
        System.out.println((3 > 2) || (5 < 2)); //True || False = True
        System.out.println(!(3 > 2)); //!(True)= False

    }
}
