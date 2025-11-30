import java.util.*;

public class equalCompare{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();

        boolean eq1 = str1.equals(str2);
        System.out.println("Is equal? "+eq1);

        boolean eq2 = str1.equalsIgnoreCase(str2);
        System.out.println("Is equalIgnoreCase? "+eq2);
        scan.close();
    }
}