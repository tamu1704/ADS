public class task1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 10};
        int target = 14;
        int[] result = closestPairToTarget(arr, target);
        System.out.println("Closest pair to target: [" + result[0] + ", " + result[1] + "]");
    }
  
    public static int[] closestPairToTarget(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int closestSum = Integer.MIN_VALUE;
        int[] result = new int[2];

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum < target) {
              
                if (sum > closestSum) {
                    closestSum = sum;
                    result[0] = arr[left];
                    result[1] = arr[right];
                }
              
                left++;
            } else {
               
                right--;
            }
        }
        return result;
    }
}