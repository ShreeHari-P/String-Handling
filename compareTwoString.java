import java.util.*;

public class compareTwoString{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = "Java";
        System.out.print("Enter a Word to Check: ");
        String input = scan.nextLine();

        boolean checkWord = input.equalsIgnoreCase(word);
        System.out.println("Input: " + input);
        System.out.println("Is same word: " + checkWord);
        scan.close();
    }
}