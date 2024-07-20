class student{
    String name,gender;
    int age;
    student(){
        name="jas";
        age=20;
        gender="male";
    }
    student(String n,int a,String g){
        name=n;
        age=a;
        gender=g;
    }
    void show(){
        System.out.println("Name= "+name);
        System.out.println("age= "+age);
        System.out.println("Gender= "+gender);
    }
}
class n {
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student("kunal",19,"male");
        System.out.println("\tStudent 1");
        s1.show();
        System.out.println("\tStudent 2");
        s2.show();

    }
}
