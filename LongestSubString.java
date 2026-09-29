package collect;
import java.util.HashSet;
import java.util.ArrayList;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "abcabcbb";

        System.out.println(longest(str));
    }

    public static int longest(String s){
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int longestStr = 0;

        for(int right=0; right<s.length(); right++){

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));

            longestStr = Math.max(longestStr, right-left+1);
        }
        return longestStr;
    }
}
