public class MAXLength {
    public static void main(String[] args) {
        int[] arr={1,0,-4,3,1,0};
        System.out.println(maxlength(arr));
    }
    public static int maxlength(int[] arr){
        int len=arr.length;
        int maxlen=0;
        for(int st=0;st<len;st++){
            int sum =0;
            for(int end=st;end<len;end++){
                sum+=arr[end];
                if(sum==0){
                    maxlen=Math.max(maxlen,end-st+1);
                }
            }
        }
        return maxlen;
    }
}