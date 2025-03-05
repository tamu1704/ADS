import java.util.Arrays;

public class leetcode66 {
    public int[] res(int[] a) {
        int n=a.length; 
        for(int i=n-1;i>=0;i--) {
            if(a[i]<9) { 
                a[i]++;
                return a;
            }
            a[i]=0;
        }
        int[] b = new int[n + 1];
        b[0] = 1; 
        return b;
    }
    public static void main(String[] args) {
        leetcode66 l = new leetcode66();
        int[] a = {1, 2, 3};
        // int[] b = {9};
        System.out.print(Arrays.toString(l.res(a)));
    }
}
