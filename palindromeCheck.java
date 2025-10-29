import java.util.*;
public class palindromeCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word for palindrome check: ");
        String word = scan.nextLine();
        
        boolean result = palindromeChecker(word);
        System.out.println("The word " + word + " is a palindrome? " + result);
        scan.close();
    }

    public static boolean palindromeChecker(String word){
        String cleanWord = word.replaceAll("\\s+","").toLowerCase();

        String reversed = new StringBuilder(cleanWord).reverse().toString();

        return cleanWord.equals(reversed);
    }
}
