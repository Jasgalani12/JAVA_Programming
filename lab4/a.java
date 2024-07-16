// find weather the entered character is vowel or not 
import java.util.*;
public class a {
    public static void main(String[] args) {
        char x;
        Scanner sc=new Scanner(System.in);
        System.out.print("Entre any character: ");
        x=sc.next().charAt(0);
        switch (x) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("char is vowel");
                break;
            default:
                System.out.println("char is Consenent");
                break;
        }
    }
}
