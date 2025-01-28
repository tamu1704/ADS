public class findLengthofsunarray {
    public static void main(String[] args) {
        int[] nums={1,-1,5,-2,3};
        int target=3;
        System.out.println("subarraysum: "+findLengthofsunarray.subarray(nums, target));
    }
    public static int subarray(int[] nums,int target){
        int sum=0;
        int start=0;
        int end=0;
        int maxLength=0;
      
        for(end=0;end<nums.length;end++){
            sum+=nums[end];
            while (sum >= target) {
                maxLength = Math.max(maxLength, end - start + 1);
                sum -= nums[start]; // Remove the element at the start
                start++; // Move the start pointer forward
            }
        }
        return maxLength;
    }
}