public class Stringques {
    public static void print(String[] a,int n){
        for(int i=0;i<n;i++){
            if(i%2!=0){
                System.out.print(a[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        String[] a={"1","2","3","4","5","6"};
        int n=a.length;
        print(a,n);
    }
}
