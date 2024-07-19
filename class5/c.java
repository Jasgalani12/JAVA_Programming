/*define a class rectangle having variables length and width.
define getvalue() methad to inaitialize value and create object and call method*/
class rectangle{
    float length;
    float width;
    void getvalue(float l,float w){
        length=l;
        width=w;
    }
    float putvalue() {
        return (length*width);
    }
}
class c {
    public static void main(String[] args) {
        rectangle s1=new rectangle();
        s1.getvalue(5.5f, 6.6f);
        System.out.println(s1.putvalue());
    }
}
