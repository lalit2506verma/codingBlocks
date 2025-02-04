package Lec17;

import java.util.ArrayList;
import java.util.List;

public class Lexicographical_Numbers {
    public static void main(String[] args) {
        int n = 1000;
        List<Integer> res = new ArrayList<>();
        Lexicographical(0, n, res);
        System.out.println(res);
    }

    public static void Lexicographical(int curr, int n, List<Integer> res){
        if(curr > n){
            return;
        }
        if(curr != 0){
            res.add(curr);
        }
        int i = 0;
        if(curr == 0){
            i = 1;
        }

        for(; i <= 9; i++){
            Lexicographical(curr* 10+i, n, res);
        }
    }
}
