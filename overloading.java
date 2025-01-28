public class overloading {
    public static void main(String[] args) {
        calculate c=new calculate();
        System.out.println(c.A(10, 20));         
        System.out.println(c.B(10, 20, 30));    
        System.out.println(c.C(10.5, 20.5));

    }
}
class calculate{
    public int A(int a,int b){
        return a+b;
    }
    public int B(int a,int b,int c){
        return a+b+c;
    }
    public double C(double  a,double  b){
        return a+b;
    }
}