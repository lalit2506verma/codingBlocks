package Lec17;

public class Permutation {
    public static void main(String[] args) {
        String ques = "abca";
        Print(ques, "");
    }

    public static void Print(String ques, String ans){
        if(ques.isEmpty()){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            if(!isPresent(ques, ch, i)){
                String s1 = ques.substring(0,i);
                String s2 = ques.substring(i+1);

                Print(s1 + s2, ans + ch);
            }
        }
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
