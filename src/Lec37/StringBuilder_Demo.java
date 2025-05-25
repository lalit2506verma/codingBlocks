package Lec37;

public class StringBuilder_Demo {
    public static void main(String[] args) {

    }

    public static void String_Time(){
        String s = "";
        for (int i = 0; i < 1000000; i++) {
            s += i;
        }
    }

    public static void StringBuilder_Time(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append(i);
        }
    }
}
