package Lec21;

public class Palindrome_Substring {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(PalindromeSubstring(s));
    }

    public static int PalindromeSubstring(String s){
        // odd
        int odd = 0;
        for (int axis = 0; axis < s.length(); axis++) {
            for (int orbit = 0; axis - orbit >= 0 && axis +orbit < s.length() ; orbit++) {
                if(s.charAt(axis - orbit) != s.charAt(axis + orbit)){
                    break;
                }
                odd++;
            }
        }

        // even
        int even = 0;
        for (double axis = 0.5; axis < s.length(); axis++) {
            for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < s.length() ; orbit++) {
                if(s.charAt((int) (axis - orbit)) != s.charAt((int)(axis + orbit))){
                    break;
                }
                even++;
            }
        }

        return even+odd;
    }
}
