import java.util.*;
public class countWords {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String sentence = scan.nextLine();

        String[] word = sentence.split(" ");
        int wordCount = word.length;

        System.out.println("Input: " + sentence);
        System.out.println("No of Words: " + wordCount);
        scan.close();
    }
}
