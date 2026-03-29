import java.util.Scanner;

public class Palindrome {
    public static String palindrome(String text){

        if(text == null){
            return "Invalid input";
        }

        String cleanWord = text.replaceAll("\\s+","").toLowerCase();
        String reversed = new StringBuffer(cleanWord).reverse().toString();

        if(cleanWord.equals(reversed)){
            return "Palindrome";
        }else{
            return "Not a Palindrome";
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String result = palindrome(word);

        System.out.println(result);
        scan.close();
    }
}
