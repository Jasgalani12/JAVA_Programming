/*define a class having method as below
    int add(int a,int b)
    int add(int a,int b,int c)
    create object and demonstrate*/
class calculate{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
class b{
    public static void main(String[] args) {
        calculate a1=new calculate();
        System.out.println("sumof 2 integer = "+a1.add(2,3));
        System.out.println("sumof 3 integer = "+a1.add(2,3,4));
    }
}

