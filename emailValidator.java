import java.util.*;
public class emailValidator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String email = scan.nextLine();

        boolean isContainsAt = email.contains("@");
        boolean isEndWithCom = email.endsWith(".com");
        boolean isTenCharacter = email.length() >= 10;

        System.out.println("Contains @: " + isContainsAt);
        System.out.println("Ends With .com: " + isEndWithCom);
        System.out.println("Length >= 10: " + isTenCharacter);
        scan.close();
    }
}
