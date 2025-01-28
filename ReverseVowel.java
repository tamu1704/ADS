// import java.util.*;
import  java.util.Arrays;
import java.util.HashSet;
import  java.util.Set;

public class ReverseVowel {
    public static void main(String[] args) {
        ReverseVowel r=new ReverseVowel();
        String s1="hello";
        System.out.println("Input:  "+s1);
        System.out.println("Output: "+r.reversevowel(s1));
    }
    public  String reversevowel(String s){
        if(s==null || s.length()==0){
            return s;
        }
        Set<Character> vowel=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[] chars=s.toCharArray();
        int left=0;
        int right=chars.length-1;
        while(left<right){
            while((left<right && !vowel.contains(chars[left]))){
                left++;
            }
            while((left<right && !vowel.contains(chars[right]))){
                right--;
            }
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}