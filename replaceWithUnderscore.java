import java.util.*;

public class replaceWithUnderscore {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = scan.nextLine();

        String withUnderscore = str.replace(" ","_");
        System.out.println("Input: "+str);

        System.out.println("Output: "+withUnderscore);
        scan.close();
    }
}
