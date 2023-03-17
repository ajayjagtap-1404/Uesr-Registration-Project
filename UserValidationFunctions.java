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
        // uc3- email id
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

    public void checkMobileNumber() {
        // UC4 - mobile number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mobile number");
        String mobile = sc.nextLine();
        Pattern p = Pattern.compile("^[+][0-9]{2}\\s[0-9]{10}");
        Matcher m = p.matcher(mobile);
        boolean result = m.matches();
        if (result) {
            System.out.println("You have entered valid mobile number ");
        } else {
            System.out.println("Sorry! you have entered invalid mobile number");

        }
    }

    public void checkPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password to check");
        String password = sc.nextLine();
        Pattern p = Pattern.compile("[A-Za-z0-9]{8,}$");
        Matcher m = p.matcher(password);
        boolean result = m.matches();
        if (result) {
            System.out.println("You have entered valid password ");
        } else {
            System.out.println("Sorry! you have entered invalid password");

        }
    }

    public void checkPasswordAtLeastOneUpperCase() {
        Scanner sc = new Scanner(System.in);
        //UC6: Password with the rule of minimum 1 capital letter
        System.out.println("Enter Password to validate ");
        String password = sc.nextLine();
        Pattern p = Pattern.compile("^(?=.*[A-Z])([A-Za-z0-9]){8,}$");
        Matcher m = p.matcher(password);
        boolean result = m.matches();
        if (result) {
            System.out.println("You have entered valid password ");
        } else {
            System.out.println("Sorry! you have entered invalid password");

        }
    }

}