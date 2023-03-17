package regex_project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidationFunctions {
    // UC1- first name
    public void checkFirstName(String name) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("You have entered valid first name");
        } else {
            System.out.println("Sorry! you have entered invalid First Name");
        }
    }
}