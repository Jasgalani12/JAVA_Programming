//define a class employee having variable id name and salary create object and access variable in main method
class employee{
    int id;
    String name;
    int salary;
}
class b {
    public static void main(String[] args) {
        employee e1=new employee();
        e1.id=3132;
        e1.name="jas";
        e1.salary=40000;
        System.out.println("id:"+e1.id);
        System.out.println("name:"+e1.name);   
        System.out.println("salary:"+e1.salary);
    }
}
