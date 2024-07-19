//define a class student having variable rollno and name.define getvalue() method to initialize value and create object and demonstrate
class std 
{
    int roll;
    String name;
    void getvalue(){
        roll=12;
        name="jas";
    }  
}
class a {
    public static void main(String[] args) {
        std s1 = new std();
        s1.getvalue();
        System.out.println(s1.roll+"  "+s1.name);
    }
}
