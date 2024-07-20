class calculate{
    int add(int x,int y){
        return(x+y);
    }
    float add(float x,float y){
        return(x+y);
    }
    String add(String x,String y){
        return(x+y);
    }
}
class o {
    public static void main(String[] args) {
        calculate c1=new calculate();
        System.out.println("Sum of two integer are "+c1.add(23,53));
        System.out.println("Sum of two float are "+c1.add(23.56f,53.53f));
        System.out.println("contation of two string are "+c1.add("JA","S"));
    }    
}
