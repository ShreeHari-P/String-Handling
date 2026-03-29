import java.util.Scanner;

public class ReplaceWords {
    public static String replace(String text, String target, String replacement){

        if(text == null || target == null || replacement == null){
            return "Invalid input";
        }

        StringBuffer sb = new StringBuffer(text);
        
        int index = sb.indexOf(target);

        sb.replace(index, index + target.length(), replacement);

        return sb.toString();
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String target = scan.nextLine();
        String replacement = scan.nextLine();

        String result = replace(text, target, replacement);
        System.out.println(result);
        scan.close();
    }
}
