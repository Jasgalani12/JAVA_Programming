/*define a class book having variable title and price.
 * define a parameterized constructor to initialize value
 * also define show() meyhod to display value
 * create object and demonstarte*/
class book{
    int price;
    String name;
    book(String n,int p){
        name=n;
        price=p;
    }
    void show(){
        System.out.println("Name of the book is "+name);
        System.out.println("Price of the book is "+price);
    }
}
class c {
    public static void main(String[] args) {
        book b1=new book("JAVA programming",380);
        b1.show();
    }
}
