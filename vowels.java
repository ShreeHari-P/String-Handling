import java.util.*;

public class vowels{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String word = scan.nextLine();
        int vowels = 0;

        for(int i = 0; i < word.length(); i++){
            char currentChar = word.charAt(i);
            if(currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
            currentChar == 'o' || currentChar == 'u'){
                vowels++;
            }
        }

        System.out.println("Word: " + word);
        System.out.println("Number of Vowels: " + vowels);
        scan.close();
    }
}