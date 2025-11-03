import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scan.nextLine();
        String revString = "";

        for(int i = str.length() - 1; i >= 0; i--){
            revString += str.charAt(i);
        }

        System.out.println("Input: " + str);
        System.out.println("Output: " + revString);
        scan.close();
    }
}
