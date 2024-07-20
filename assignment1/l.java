class rectangle{
    float length,width;
    void setvalue(){
          length=25.34f;
          width=23.65f;
    }
    float area(){
        return (length*width);
    }
}
class l {
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        r1.setvalue();
        System.out.println("Area of rectangle is "+r1.area());
    }
}
