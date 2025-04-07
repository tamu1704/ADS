import java.util.*;
public class leetcode560{
    //given an array of integers 
    public static int res(int[] a,int k){
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);  //to count subarray that sum upto k from start
        int c=0,sum=0;
        for(int i:a){
            sum+=i;
            //if (sum-k) exists, we found subarray that ends at current index and sums to k
            if(hm.containsKey(sum-k)){
                c+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return c;
    }
    public static void main(String[] args){
        int[] a={1,2,3};
        int k=3;
        int r=res(a,k);
        System.out.println(k+" "+r);
    }
}