public class PivotIndex {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 4, 6, 6};
        int pivotIndex = pivot(arr);
        System.out.println("Pivot Index: " + pivotIndex); 
    }

    public static int pivot(int[] arr) {
        int totalSum = 0; 
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0; 

        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i]; 
            if (leftSum == rightSum) {
                return i; 
            }
            leftSum += arr[i]; 
        }

        return -1; 
    }
}