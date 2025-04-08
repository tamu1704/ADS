import java.util.*;
public class kthLargestUsingPQ {
    public static int res(int[] a,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:a){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int[] a=new int[5];
        int k=obj.nextInt();
        for(int i=0;i<a.length;i++){
            a[i]=obj.nextInt();
        }
        System.out.println(res(a,k)+" ");
    }
}
