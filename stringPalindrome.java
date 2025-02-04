
import java.util.*;
public class stringPalindrome{
    public static String Result(String s){
        int n=s.length();
        if(s==null||n==0) return s;
        String t=s+"#"+new StringBuilder(s).reverse().toString();
        int[] lps=clips(t);
        int palind=lps[t.length()-1];
        String rem=s.substring(palind);
        String prefix=new StringBuilder(rem).reverse().toString();
        return prefix+s;
    }
    private static int[] clips(String s){
        int n=s.length();
        int[] lps=new int[n];
        int j=0;
        for(int i=1;i<n;i++){
            while(j>0 && s.charAt(i)!=s.charAt(j)){
                j=lps[j-1];
            }
            if(s.charAt(i)==s.charAt(j)){
                j++;
                lps[i]=j;
            }
        }
        return lps;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String res=Result(s);
        System.out.println(res);
    }
}