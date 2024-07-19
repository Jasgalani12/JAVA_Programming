//define a class student having variable rollno and name.define getvalue() method to initialize value and putvalue() method to display value. create object and demonstrate
class std{
    int roll;
    String name;
    void getvalue(int r,String n){
        roll=r;
        name=n;
    }
    void putvalue(){
        System.out.println(roll+"  "+name);
    }
}
class b {
    public static void main(String[] args) {
        std s1=new std();
        s1.getvalue(16, "jas");
        s1.putvalue();
    }
} 