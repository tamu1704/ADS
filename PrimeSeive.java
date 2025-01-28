public class PrimeSeive{
    public static void main(String[] args) {
        int n=100;
        seive(n);
    }
    public static void seive(int n){
        boolean[] isprime=new boolean[n+1];
        for(int i=0;i<n;i++){
            isprime[i]=true;
        }
        isprime[0]=isprime[1]=false;
        for(int p=2;p*p<=n;p++){
            if(isprime[p]){
                for(int i=p*p;i<=n;i+=p){
                    isprime[i]=false;
                }
            }
        }
        System.out.println("Prime number up to: "+n);
        for(int i=0;i<n;i++){
            if(isprime[i]){
                System.out.print(i+" ");
            }
        }
    }
}