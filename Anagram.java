import java.util.*;

public class Anagram {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Two String: ");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        boolean isAnagram = true;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int[] count = new int[26];

        if(str1.length() != str2.length()){
            isAnagram = false;
        }

        for(int i = 0; i < str1.length(); i++){
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        for(int val : count){
            if(val != 0){
                isAnagram = false;
            }
        }

        if(isAnagram) System.out.println("Anagram");
        else System.out.println("Not Anagram");
        scan.close();
    }    
}
