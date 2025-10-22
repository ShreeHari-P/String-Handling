import java.util.*;
public class wordAnalyzer {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String word = scan.nextLine();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length()-1);

        String uppercase = word.toUpperCase();
        String lowercase = word.toLowerCase();
        int len = word.length();

        System.out.println("Word: " + word);
        System.out.println("First Char: " + firstChar);
        System.out.println("Last Char: " + lastChar);
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);
        System.out.println("Length: " + len);
        scan.close();
    }
}
