public class RunningSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] result=RunningSum.runningsum(arr);
        for(int num:result){
            System.out.println(num);
        }
    }
    public static int[] runningsum(int[] arr){
        int[] result=new int[arr.length];
        result[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            result[i]=result[i-1]+arr[i];
        }
        return result;
    }
}