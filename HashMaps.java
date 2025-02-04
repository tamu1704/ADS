import java.util.HashMap;
public class HashMaps {
    public static void main(String[] args) {
        int[] arr={1,0,-4,3,1,0};
        System.out.println(maxlength(arr));
    }
    public static int maxlength(int[] arr){
        int sum=0;
        int maxlen=0;
        HashMap<Integer, Integer> SIM = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxlen=i+1;
            }
            if(SIM.containsKey(sum)){
                maxlen=Math.max(maxlen,i-SIM.get(sum));
            }
            else{
                SIM.put(sum,i);
            }
        }
       return maxlen;
    }
}