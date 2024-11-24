
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main7 {

    public static void main(String[] args) {
        
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,6}$";


        String[] emails = {
            "test.email@example.com",
            "invalid-email.com",
            "user@domain.co",
            "name@domain"
        };

        Pattern pattern = Pattern.compile(regex);

        for (String email : emails){
            Matcher matcher = pattern.matcher(email);

            if(matcher.matches()){
                System.out.println("It is Valid Email...");
            }else{
                System.out.println("it is INvalid! email...");
            }
        }
    }

}
