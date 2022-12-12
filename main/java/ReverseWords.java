import java.util.Scanner;

public class ReverseWords {
    public static String reversing(String s){
        char[] letterWords= new char[s.length()];

        int letterIndex= 0;
        for (int i = s.length()-1; i>= 0 ; i--) {
            letterWords[letterIndex] = s.charAt(i);
            letterIndex++;
        }
        String reverseStatement = "";
        for (int i = 0; i < s.length(); i++) {
            reverseStatement+= letterWords[i];

        }
        return reverseStatement;
    }
    public static void main(String[] args) {
        System.out.println("What word or phrase would you like to reverse?");
        Scanner scanner = new Scanner(System.in);
        String userInputAnswer = scanner.nextLine();
        String reversedWords= reversing(userInputAnswer);
        System.out.println(reversedWords);
    //String reversedWords= reversing("Spirited Away");
        //System.out.println(reversedWords);
    }
}
