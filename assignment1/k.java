class book{
    String title;
    int price;
    void getbook(){
        title="java programming";
        price=350;
    }
    void putbook(){
        System.out.println("Name of the book is "+title);
        System.out.println("Price of the book is "+price);
    }
}
class k {
    public static void main(String[] args) {
        book b1=new book();
        b1.getbook();
        b1.putbook();
    }
}
