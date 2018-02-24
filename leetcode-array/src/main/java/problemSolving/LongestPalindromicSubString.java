package problemSolving;

/**
 * Given a string s, find the longest palindromic substring in s.
 * You may assume that the maximum length of s is 1000.
 */
public class LongestPalindromicSubString {

    public static void main(String[] args) {

        String s = "baabd";
        String res = palindromicSubString(s);

        System.out.print(res);
    }

    public static String palindromicSubString(String s) {
        int start = 0, end = s.length()-1, even = 0, odd = 0, maxLen = 0;

        for (int i=0; i<s.length(); i++) {
            even = findLength(s, i, i+1);
            odd = findLength(s, i, i);

            if (even > maxLen) {
                maxLen = even;
                even = even/2 -1;
                start = i-even;
                end = i+even+1;
            }

            if(odd > maxLen) {
                maxLen = odd;
                odd = odd/2;
                start = i-odd;
                end = i+odd;
            }
        }
        return s.substring(start, end+1);
    }

    public static int findLength(String s, int i, int j) {
        int len = 0;
        while (i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)) {
            len = j-i+1;
            i--;
            j++;
        }
        return len;
    }
}
