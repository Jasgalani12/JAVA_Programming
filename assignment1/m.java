class circle{
    float radius;
    circle(){
        radius=5.5f;
    }
    void area(){
        System.out.println("Area of circle: "+(3.14*radius*radius));
    }
}
class m {
    public static void main(String[] args) {
        circle c1=new circle();
        c1.area();
    }
}
