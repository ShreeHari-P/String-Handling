import java.util.*;
public class sumOfDigits {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        String str = scan.nextLine();

        String digitsOnly = str.replaceAll("[^0-9]","");
        for(int i = 0; i < digitsOnly.length(); i++){
            char ch = digitsOnly.charAt(i);

            sum += Character.getNumericValue(ch);
        }

        System.out.println("Sum: "+sum);
        scan.close();
    }
}
