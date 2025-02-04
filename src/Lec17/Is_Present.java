package Lec17;

public class Is_Present {
    public static void main(String[] args) {
        String s = "ababcdeaacc";
        char ch = 'a';
        int i = 3;
        System.out.println(isPresent(s, ch, i));
    }

    public static boolean isPresent(String s, char ch, int i){
        for(int j = i+1; j < s.length(); j++){
            if(s.charAt(j) == ch){
                return true;
            }
        }
        return false;
    }
}
