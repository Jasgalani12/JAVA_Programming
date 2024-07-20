class employee{
    int age;
    String name;
    float salary;
}
class j {
    public static void main(String[] args) {
        employee e1=new employee();
        e1.age=23;
        e1.name="Jas Galani";
        e1.salary=2300.5f;
        System.out.println("Mr./Ms "+e1.name+", your age is "+e1.age+" and your salary is "+e1.salary);
    }
}
