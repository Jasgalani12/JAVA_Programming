import java.util.*;
class g {
    public static void main(String[] args) {
        String name;
        int rollno;
        int x1,x2,x3,x4,x5;
        int avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name=sc.next();
        System.out.print("Enter your rollno: ");
        rollno=sc.nextInt();
        System.out.print("Enter marks 1: ");
        x1=sc.nextInt();
        System.out.print("Enter marks 2: ");
        x2=sc.nextInt();
        System.out.print("Enter marks 3: ");
        x3=sc.nextInt();
        System.out.print("Enter marks 4: ");
        x4=sc.nextInt();
        System.out.print("Enter marks 5: ");
        x5=sc.nextInt();
        avg=(x1+x2+x3+x4+x5)/5;
        if(avg<=100 && avg>=70){
            System.out.println("Distinction");
        }
        else if(avg<70 && avg>=60){
            System.out.println("1st class");
        }
        else if(avg<60 && avg>=50){
            System.out.println("2st class");
        }
        else if(avg<50 && avg>=40){
            System.out.println("pass class");
        }
        else{
            System.out.println("Fail");
        }
    }
}