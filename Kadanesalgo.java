public class Kadanesalgo {
    public static void main(String[] args) {
        int nums[]={1,-2,3,4,-1,2,1,-5,4};
        System.out.println("MAximun SubArray sum: "+Kadanesalgo.maxsubarray(nums));

    }
    public static int maxsubarray(int[] nums){
        // if(nums==null|| nums.length==0){
        //     return 0;
        // }
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currentsum=Math.max(currentsum+nums[i],nums[i]);
            //condition for neg part
            if(currentsum<0){
                currentsum=0;
            }
            maxsum=Math.max(maxsum,currentsum);
        }
        return maxsum;
    }

}