public class stringEncryptor {
    public static String encrypt(String input){
        String result = "";

        for(int i = 0; i < input.length(); i++){
            char currentChar = input.charAt(i);
            char encryptedChar = (char)(currentChar + 1);
            result += encryptedChar;
        }

        return result;
    }    

    public static void main(String[] args){
        System.out.println(encrypt("abc"));
        System.out.println(encrypt("hello"));
        System.out.println(encrypt("xyz"));
        System.out.println(encrypt("Kalai"));
        System.out.println(encrypt("Hari"));
        System.out.println(encrypt("ABC"));
    }
}
