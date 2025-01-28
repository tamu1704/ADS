public class overriding {
    public static void main(String[] args) {
        car c=new car();
        c.color();
        BMD b=new BMD();
        System.out.println("BMD COLOR: ");
        b.color();
    }
}
class car{
    public void color(){
        System.out.println("Black Color");
    }
}
class BMD extends car{
    @Override
    public void color(){
        System.out.println("white color");
    }
}