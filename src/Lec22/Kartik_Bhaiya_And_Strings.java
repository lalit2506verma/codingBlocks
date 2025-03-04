package Lec22;

public class Kartik_Bhaiya_And_Strings {
    public static void main(String[] args) {
        String str = "aaaabaaabaaabaaaba";
        int k = 2;
        int flipA = MaximumLength(str, k, 'a');
        int flipK = MaximumLength(str, k, 'b');
        System.out.println(Math.max(flipA, flipK));
    }

    private static int MaximumLength(String str, int k, char ch) {
        int s = 0, e = 0, flip = 0, ans = 0;
        while(e < str.length()){
            // grow
            if(str.charAt(e) == ch){
                flip++;
            }

            //shrink
            while(flip > k && s <= e){
                if(str.charAt(s) == ch){
                    flip--;
                }
                s++;
            }

            // ans update
            ans = Math.max(ans, e - s + 1);
            e++;
        }

        return ans;
    }
}
