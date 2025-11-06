import java.util.*;

public class middleLetter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String str = scan.nextLine();
        
        int len = str.length();
        int middle_term = len / 2;
        char middle_letter = str.charAt(middle_term);

        System.out.println("Middle term of the word "+str+" is "+middle_letter);
        scan.close();
    }    
}
