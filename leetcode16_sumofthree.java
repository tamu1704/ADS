
import java.util.*;

public class leetcode16_sumofthree {
    public static void main(String[] args) {
        int[] nums1={-1,2,1,-4};
        int target1=1;
        int[] nums2={0,0,0};
        int target2=1;
        System.out.println("closest Sum"+ target1+" is "+three(nums1, target1));
        System.out.println("closest Sum"+ target2+" is "+three(nums2, target2));
    }
    public static int three(int[] nums,int target){
        Arrays.sort(nums);
        int closestsum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int currsum=nums[i]+nums[l]+nums[r];
                if(Math.abs(target-currsum)<Math.abs(target-closestsum)){
                    closestsum=currsum;
                }
                if(currsum<target){
                    l++;
                }
                else if(currsum>target){
                    r--;
                }
                else{
                    return currsum;
                }

            }
        }
        return closestsum;
    }
}