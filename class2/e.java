//input rollno.,name and percentage of student and print
import java.util.*;
public class e {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Roll No. ");
        int roll=sc.nextInt();
        System.out.print("Enter your Name: ");
        String name=sc.next();
        System.out.print("Enter your Percentage: ");
        float per=sc.nextFloat();
        System.out.println("Roll No="+roll);
        System.out.println("Name="+name);
        System.out.println("Percentage:"+per);
    }
}
