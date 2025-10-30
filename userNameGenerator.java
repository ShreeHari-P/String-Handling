import java.util.Random;
import java.util.Scanner;

public class userNameGenerator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = scan.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scan.nextLine();

        String userName = generateUsername(firstName, lastName);
        System.out.println("Generated UserName: " + userName);
        scan.close();
    }

    public static String generateUsername(String firstName, String lastName){
        String firstPart = firstName.length() >= 3 ? firstName.substring(0,3) : firstName;

        String lastPart = lastName.length() >= 3 ? lastName.substring(0,3) : lastName;

        Random rand = new Random();
        int randomNumber = rand.nextInt(10);

        String userName = (firstPart + lastPart + randomNumber).toString();

        return userName;
    }
}
