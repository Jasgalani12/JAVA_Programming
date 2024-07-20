import java.util.*;
class h {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[5];
        for(int i=0;i<x.length;i++){
            System.out.print("Enter value "+(i+1)+": ");
            x[i]=sc.nextInt();
        }
        for(int i=0;i<x.length;i++){
            System.out.println("value "+i+"="+x[i]);
        }
    }
}
