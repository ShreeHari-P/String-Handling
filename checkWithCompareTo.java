import java.util.*;
public class checkWithCompareTo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        int result = str1.compareTo(str2);

        if(result < 0){
            System.out.println(str1 + " comes before " + str2);
        } else if(result > 0){
            System.out.println(str2 + " comes before " + str1);
        } else{
            System.out.println("Both words are same "+str1);
        }
        scan.close();
    }
}
