//define a class student having variable rollno and name.create object and access varible in main method
class student{
    int roll;
    String name;
}
class a {
    public static void main(String[] args) {
        student s1=new student();
        s1.roll=10;
        s1.name="jas";
        System.out.println("Roll No.:"+s1.roll);
        System.out.println("Name:"+s1.name);
    }
}