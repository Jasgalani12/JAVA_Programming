/*define a class having method as below
    int add(int a,int b)
    float add(float a,float b)
    String add(String a,String b)
    
    create object and demonstrate*/
class calculate{
    int add(int a,int b){
        return a+b;
    }
    float add(float a,float b){
        return a+b;
    }
    String add(String a,String b){
        return a+b;
    }
}
class a {
    public static void main(String[] args) {
        calculate a1=new calculate();
        System.out.println("sumof 2 integer = "+a1.add(2,3));
        System.out.println("sumof 2 integer = "+a1.add(2.2f,3.7f));
        System.out.println("sumof 2 integer = "+a1.add("jas","galani"));
    }
}
