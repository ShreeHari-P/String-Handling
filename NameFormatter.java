import java.util.*;
public class NameFormatter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Name: ");
        String name = scan.nextLine();

        String result = nameFormatter(name);

        System.out.println("The Name is: " + result);
        scan.close();
    }

    public static String nameFormatter(String name){

        String result = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();

        return result;
    }
}
