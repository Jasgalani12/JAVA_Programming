/*define a class book having variable title and price.
 * define a default constructor to initialize value
 * also define show() meyhod to display value
 * create object and demonstarte*/
class book{
    int price;
    String name;
    book(){
        name="java prgramming";
        price=350;
    }
    void show(){
        System.out.println("Name of the book is "+name);
        System.out.println("Price of the book is "+price);
    }
}
class b {
    public static void main(String[] args) {
        book b1=new book();
        b1.show();
    }
}
