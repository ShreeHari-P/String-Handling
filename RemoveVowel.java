import java.util.Scanner;

public class RemoveVowel {
    public static String removeVowel(String word){

        if(word == null){
            return "Invalid input";
        }

        StringBuilder sb = new StringBuilder();

        for(char ch : word.toCharArray()){

            if(!"AEIOUaeiou".contains(String.valueOf(ch))){
                sb.append(ch);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        String result = removeVowel(word);
        System.out.println("After Vowel Removed: " +result);
        System.out.println("Vowel Removed: "+(word.length() - result.length()));
        scan.close();
    }
}
