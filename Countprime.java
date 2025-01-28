public class Countprime {
    public static void main(String[] args) {
        int L=20;
        int R=30;
        System.out.println(countP(L, R));
    }
    public static int countP(int L,int R){
        int[] isprime=new int[R+1];
        for(int i=0;i<=R;i++){
            isprime[i]=1;
        }
        isprime[0]=isprime[1]=0;
        for(int i=2;i*i<=R;i++){
            if(isprime[i]==1){
                for(int j=i*i;j<=R;j+=i){
                    isprime[j]=0;
                }
            }
        }
        int count=0;
        for(int i=L;i<=R;i++){
            if(isprime[i]==1){
                count++;
            }
        }
        return count;
    }
}