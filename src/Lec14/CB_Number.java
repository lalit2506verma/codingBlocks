package Lec14;

public class CB_Number {
    public static void main(String[] args) {
        String str = "";
    }

    public static void countCBnumber(String s){
        int count = 0;

        boolean[] visited = new boolean[s.length()];

        for (int len = 1; len <= s.length() ; len++) {
            for (int j = len; j <= s.length() ; j++) {
                int i = j - len;
                long num = Long.parseLong(s.substring(i, j));
                if(isCBNumber(num) && isValid(visited, i , j-1)){
                    count++;
                    for (int k = i; k < j-1; k++) {
                        visited[k] = true;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isValid(boolean[] visited, int i, int i1) {
        for (int j = i; j <= i1; j++) {
            if(visited[j]){
                return false;
            }
        }

        return true;
    }

    public static boolean isCBNumber(long num){
        if(num == 0 || num == 1){
            return false;
        }

        int[] arr = {2,3,5,7,11,13,17,19,23,29};

        for(int a : arr){
            if(a == num){
                return true;
            }
        }

        for(int a : arr){
            if(num % a == 0){
                return false;
            }
        }

        return true;

    }
}
