import java.util.*;
public class sortUsingCompare {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter words separated by space (Press Enter when done): ");
        String in = scan.nextLine();
        String[] input = in.split("\\s+");

        System.out.println("\nBefore Sorted: ");
        for(String words : input){
            System.out.println(words);
        }

        Arrays.sort(input);
        System.out.println();

        for(String words : input){
            System.out.println(words);
        }
        scan.close();
    }
}
