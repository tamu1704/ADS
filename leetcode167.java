import java.util.*;

public class leetcode167{
    public static void main(String[] args) {
        int[] nums={2,3,4};
        int target=6;
        int[] result=tow(nums, target);
        if(result.length==2){
            System.out.println("Indices"+ Arrays.toString(result));
        }
    }
    public static int[] tow(int[] nums,int target){
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int sum=nums[l]+nums[r];
            if(sum==target){
                return new int[]{l+1,r+1};
            }
            else if(sum<target){
                l++;
            }
            else{
                r--;
            }
        }
        return  new int[]{};
    }
}