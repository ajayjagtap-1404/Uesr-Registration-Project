package regex_project;

public class UserRegistrationMain {

    public static void main(String[] args) {
        UserValidationFunctions validationFunctions = new UserValidationFunctions();
        System.out.println("Welcome to Validation Program");
        validationFunctions.checkFirstName("Ajay");
    }
}