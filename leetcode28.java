import java.util.*;
public class leetcode28 {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String n=obj.nextLine();
        int res=strStr(s,n);
        System.out.println(res);
    }
}
