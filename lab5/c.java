import java.util.*;
class c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x[]= new int[5];
        int sum=0;
        for(int i=0;i<x.length;i++){
            System.out.print("enter value "+(i+1)+":");
            x[i]=sc.nextInt();
            sum=sum+x[i];
        }
        System.out.println("Sum of all values="+sum);
   }    
}