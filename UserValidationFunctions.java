package regex_project;

import java.util.Scanner;
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

    public void checkLastName() {
        // uc2 - validate last name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Last Name : "); //Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
        System.out.println("Last name starts with Capital letters and has minimum 3 characters");
        String lastName = scanner.next();
        boolean result = Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
        if (result) {
            System.out.println("You have entered valid LastName ");
        } else {
            System.out.println("Sorry! you have entered invalid Last Name");
        }
    }

    public void checkEmailId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email id");
        String email = sc.next();
        Pattern p = Pattern.compile("^[a-z0-9]+([._+-][a-z0-9]*)?@[a-z0-9]+([.][a-z]{2,4})([.][a-z]{2})?$");
        Matcher m = p.matcher(email);
        boolean result = m.matches();
        if (result) {
            System.out.println("You have entered valid email ");
        } else {
            System.out.println("Sorry! you have entered invalid email");

        }
    }

}