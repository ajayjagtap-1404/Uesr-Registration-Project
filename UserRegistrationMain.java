package regex_project;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserValidationFunctions validationFunctions = new UserValidationFunctions();
        System.out.println("Welcome to Validation Program");


        boolean loop = true;
        while (loop) {
            System.out.println("Enter which user information you want to validate");
            System.out.println("1. first name \n 2. Last name \n 3. exit \n 4. Email id ");
            int input = sc.nextInt();
            final int firstName = 1, lastName = 2 , exit = 3, emailId = 4;

            switch (input) {
                case firstName :
                    validationFunctions.checkFirstName("Ajay");
                    break;
                case  lastName:
                    validationFunctions.checkLastName();
                    break;
                case exit:
                    loop = false;
                    System.out.println(" Thank for visiting ");
                    break;
                case emailId:
                    validationFunctions.checkEmailId();
                    break;
                default:
                    System.out.println("Invalid input ....");
                    break;
            }
        }
    }
}