import java.util.*;
class b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x[]= new int[5];
        for(int i=0;i<x.length;i++){
            System.out.print("enter value "+(i+1)+":");
            x[i]=sc.nextInt();
        }
        for(int i=0;i<x.length;i++){
            System.out.println("value "+(i+1)+" ="+x[i]);
        }
   }    
}