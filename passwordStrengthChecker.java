import java.util.*;

public class passwordStrengthChecker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Password: ");
        String password = scan.nextLine();

        boolean hasMinLength = password.length() > 8;
        boolean hasSpecialChar = password.contains("@") || password.contains("#") || password.contains("$");
        boolean containsNumber = password.contains("0") || password.contains("1") || password.contains("2")
                                || password.contains("3") || password.contains("4") || password.contains("5")
                                || password.contains("6") || password.contains("7") || password.contains("8")
                                || password.contains("9");
        boolean isPasswordStrong = hasMinLength && hasSpecialChar && containsNumber;

        System.out.println("Password length: " + password.length());
        System.out.println("Contains special char: " + hasSpecialChar);
        System.out.println("Contains number: " + containsNumber);
        System.out.println("Strong password: " + isPasswordStrong);
        scan.close();
    }    
}
