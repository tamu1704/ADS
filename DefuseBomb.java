public class DefuseBomb {
    public static void main(String[] args){
        //priblem number 1652 (defuse the bomb)
        int[] arr={4,6,11,16};
        int k=5;
        int[] result = decrypt(arr, k);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] decrypt(int[] arr,int k){
        int n=arr.length;
        int[] result=new int[n];
        if(k==0){
            return result;
        }
        int start,end,step;
        if(k>0){
            start=1;
            end=k;
            step=1;
        }
        else{
            start=-1;
            end=k;
            step=-1;
            k=-k;
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=1;j<k;j++){
                int index=(i+(j*step)+n)%n;
                sum+=arr[index];
            }
            result[i]=sum;
        }
        return result;
    }
}