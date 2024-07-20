/*define a class demo having following method 
    void display(int a)
    void display(float a)
    void display(char a)
    void display(String a)
    create object and demonstrate*/
class demo{
    void display(int a){
        System.out.println(a);
    }
    void display(float a){
        System.out.println(a);
    }
    void display(char a){
        System.out.println(a);
    }
    void display(String a){
        System.out.println(a);
    }
}
class c {
    public static void main(String[] args) {
        demo d1=new demo();
        d1.display(5);
        d1.display(3.5f);
        d1.display('j');
        d1.display("jas");
    }    
}
