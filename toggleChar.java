import java.util.*;
public class toggleChar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String output = toggleCase(str);
        System.out.println("Output: "+output);
        scan.close();
    }

    public static String toggleCase(String word){
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);

            if(Character.isUpperCase(ch)){
                result.append(Character.toLowerCase(ch));
            } else if(Character.isLowerCase(ch)){
                result.append(Character.toUpperCase(ch));
            } else{
                result.append(ch);
            }
        }
        return result.toString();
    }
}
