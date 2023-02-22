import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String s = in.nextLine();

        for (int i = 0; i < args.length; i++) {
            String a = args[i];
        }
        if (palindrome(s)) System.out.println(s + " - палиндром");
        else
            System.out.println(s+" - не палиндром");
    }

    public static String reverseString(String s) {
        String c ="";
        for (int i=s.length()-1;i>=0;i--)
            c+=s.charAt(i);
        return c;
    }

    public static boolean palindrome(String s){
        String c = reverseString(s);
        if(s.equals(c)) return true;
        else return false;
    }
}


