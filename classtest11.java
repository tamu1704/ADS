import java.util.*;

//Find the Sum of Digits of a Number (123 → 6)
public class classtest11 {
    public static int res(int n){
        int sum=0;
        while(n>0){
            int temp=n%10;
            sum=sum+temp;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int r=res(n);
        System.out.println(r);
    }
}
