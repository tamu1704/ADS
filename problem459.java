public class problem459 {
    public static void main(String[] args) {
        System.out.println(repeat("abab"));
    }
    public static boolean repeat(String s){
        String  d=s+s;
        return  d.substring(1,d.length()-1).contains(s);
    }
}