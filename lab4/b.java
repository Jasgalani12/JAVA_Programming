//write a program then input 2 integer value and get output with swap value (note* without using 3rd value)
class b {
    public static void main(String[] args) {
        int x=5,y=4;
        System.out.println("x="+x);
        System.out.println("y="+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}