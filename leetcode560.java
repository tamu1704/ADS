import java.util.HashMap;
import java.util.Map;

public class leetcode560 {
    public static int result(int[] a,int k){
        Map<Integer,Integer>m=new HashMap<>();
        m.put(0,1);
        int preSum=0, c=0;
        for(int n:a){
            preSum+=n;
            if(m.containsKey(preSum-k)){
                c+=m.get(preSum-k);
            }
            m.put(preSum,m.getOrDefault(preSum, 0)+1);
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int k = 3; // 2
        System.out.println(result(a, k));
    }
}
