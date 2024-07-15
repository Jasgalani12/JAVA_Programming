//calculate simple interest
import java.util.*;
class a {
    public static void main(String args[]) {
        int p,r,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter price: ");
        p=sc.nextInt();
        System.out.print("Enter rate of interest: ");
        r=sc.nextInt();
        System.out.print("Enter no.of years: ");
        n=sc.nextInt();
        System.out.println("Simple interest="+((p*r*n)/100));
    }
}
