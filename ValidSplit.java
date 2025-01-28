public class ValidSplit {
    public static void main(String[] args) {
        int[] arr={10,4,-8,7};
        System.out.println("numver pf valid splits:" +ValidSplit.validsplit(arr));
    }
    public  static int validsplit(int[] arr){
        int totalsum=0;
        for(int num:arr){
            totalsum+=num;
        }
        int leftsum=0;
        int validsplit=0;
        for(int i=0;i<arr.length-1;i++){
            leftsum+=arr[i];
            int rightsum=totalsum-leftsum;
            if(leftsum>=rightsum){
                validsplit++;
            }
        }
        return  validsplit;
    }
}