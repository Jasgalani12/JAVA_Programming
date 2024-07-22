/*define a class book having variable title and price
 * define default and papameterized constructor to initialize value
 * also define show()method to display value 
 * create objecct and demonstrate*/
class book{
    int price;
    String title;
    book(){
        title="java prgramming";
        price=350;
    }
    book(String t,int p){
        title=t;
        price=p;
    }
    void show(){
        System.out.println("\ntitle of the book is "+title);
        System.out.println("Price of the book is "+price+"\n");
    }
}
class d {
    public static void main(String[] args) {
        book b1=new book();
        book b2=new book("Python programming",1045);
        System.out.println("\twithout parameters");
        b1.show();
        System.out.println("\twith parameters");
        b2.show();
    }
}