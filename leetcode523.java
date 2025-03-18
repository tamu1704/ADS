
public class leetcode523 {
    public static boolean result(int[] a, int k) {
        int n=a.length;
        for(int i=1;i<n;i++){
            if((a[i]+a[i-1])==k){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {23,2,4,6,7};
        int k = 6;
        System.out.println(result(a, k));
    }
}
