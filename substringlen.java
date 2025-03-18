import java.util.*;
public class substringlen {
    //given string s find the length of longest substring without repeating characters
    public static int result(String s){
        Set<Character> q=new HashSet<>();
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!q.contains(ch)){
                q.add(ch);
                sb.append(ch);
            }
        }
        String r=sb.toString();
        return r.length();
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s="abcabcbb";
        System.out.println(result(s));
    }
}
