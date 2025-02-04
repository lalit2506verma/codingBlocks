package Lec17;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parenthesis {
    public static void main(String[] args) {
        int n = 3;
        List<String> res = new ArrayList<>();
        generate(n, 0, 0, "", res);
    }

    public static void generate(int n, int open, int closed, String ans, List<String> res){
        if(open == n && closed == n){
            res.add(ans);
            return;
        }
        if(open > n || closed > open){
            return;
        }
        generate(n, open + 1, closed, ans + "(", res);
        generate(n, open, closed+1, ans + ")", res);
    }
}
