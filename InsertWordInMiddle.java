import java.util.Scanner;

public class InsertWordInMiddle {
    public static String insertWord(String word, String addWord){

        if(word == null || addWord == null){
            return "Invalid input";
        }
        
        StringBuilder sb = new StringBuilder(word);
        int index = word.indexOf(" ");

        if(index == -1){
            sb.append(" ").append(addWord);
        }else{
            sb.insert(index, " " + addWord);
        }

        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        String addWord = scan.nextLine();
        String result = insertWord(word, addWord);
        System.out.println(result);
        scan.close();
    }
}
