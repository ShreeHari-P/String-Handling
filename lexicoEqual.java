import java.util.*;
public class lexicoEqual {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        if(str1.compareTo(str2) == 0){
            System.out.println("Both words are lexicographically same");
        } else{
            System.out.println("Both words are not lexicographically same");
        }
        scan.close();
    }
}
