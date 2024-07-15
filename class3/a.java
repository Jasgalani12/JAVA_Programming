//input one no. and check wether it is positive ,negative or zero
import java.util.*;
class a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int x=sc.nextInt();
        if(x>0){
            System.out.println("Number is positive...");
        }
        else if(x<0){
            System.out.println("Number is negative...");
        }
        else{
            System.out.println("Number is zero...");
        }
    }
}
