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
            System.out.println(" 1. first name \n 2. Last name \n 3. exit \n 4. Email id \n 5. Phone Number " +
                    "\n 6. Password \n 7. password check at least 1 Upper case letter");
            System.out.println("8.  password check at least 1 digit ");
            System.out.println("9. password check at least 1 Special character ");
            System.out.println("10. Check email Sample");
            int input = sc.nextInt();
            final int firstName = 1, lastName = 2 , exit = 3, emailId = 4, phoneNumber = 5, password = 6, atLeastOneUpperCase = 7,
                    atLeastOneDigit = 8, atLeastOneSpecialCharacter = 9 ,checkEmailSample = 10;

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
                case phoneNumber:
                    validationFunctions.checkMobileNumber();
                    break;
                case password:
                    validationFunctions.checkPassword();
                    break;
                case atLeastOneUpperCase:
                    validationFunctions.checkPasswordAtLeastOneUpperCase();
                    break;
                case atLeastOneDigit:
                    validationFunctions.checkPassWordAtLeastOneNumber();
                    break;
                case atLeastOneSpecialCharacter:
                    validationFunctions.checkPassWordAtLeastOneSpecialCharacter();
                    break;
                case checkEmailSample:
                    validationFunctions.validationOfEmail();
                    break;
                default:
                    System.out.println("Invalid input ....");
                    break;
            }
            System.out.println("-------------------------------------------------------------------");
        }
    }
}