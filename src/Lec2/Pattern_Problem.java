package Lec2;

public class Pattern_Problem {
    public static void main(String[] args) {
        pattern30(5);
    }

    public static void pattern1(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int i = 0; i < n; i++){
            for(int j = n-i; j > 0; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int i = 0; i < n; i++){
            // for spaces
            for(int j = n-i-1; j > 0; j--){
                System.out.print("   ");
            }

            // for pattern
            for(int j = 0; j < i+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int i = 0; i < n; i++){
            // for spaces
            for(int j = 0; j < i; j++){
                System.out.print("   ");
            }

            //for pattern;
            for(int j = n-i; j > 0; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for(int i = 0; i < n; i++){
            // For Spaces
            for(int j = 0; j < i*2; j++){
                System.out.print("   ");
            }

            // for pattern
            for(int j = n-i; j > 0; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || i == n-1){
                    System.out.print(" * ");
                }
                else{
                    if(j == 0 || j == n-1){
                        System.out.print(" * ");
                    }
                    else{
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void pattern8(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j || i+j == n-1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern9(int n){
        for(int i = 0; i < n; i++){
            //for spaces
            for(int j = 0; j < n - i - 1; j++){
                System.out.print("   ");
            }

            // for stars
            for(int j = 0; j <= 2*i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    public static void pattern10(int n){
        for(int i = n; i > 0; i--){
            // For spaces
            for(int j = 0; j < n-i; j++){
                System.out.print("   ");
            }

            // For stars
            for(int j = 0; j < 2*i-1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // Didn't work
    public static void pattern11(int n){
        for(int i = 0; i < n; i++){
            // for spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // for stars;
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern13(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int i = 0; i < n; i++){
            for(int j = n-i; j > 0; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern14(int n){
        for(int i = 0; i < n; i++){
            for(int j = n-i; j > 0; j--){
                System.out.print("   ");
            }

            for(int j = n; j > n-i; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("   ");
            }

            for(int j = n-i; j > 0; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern15(int n){
        for(int i = 0; i < n; i++){
            // For Spaces
            for(int j = 0; j < i*2; j++){
                System.out.print("   ");
            }

            // For Stars
            for(int j = 0; j < n-i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int i = n; i > 0; i--){
            for(int j = 2*(i-1); j > 0; j--){
                System.out.print("   ");
            }

            for(int j = n-i+1; j > 0; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern16(int n){
        for(int i = 0; i < n; i++){
            // for spaces
            for(int j = 0; j < n-i; j++){
                System.out.print("   ");
            }

            // for stars
            for(int j = 0; j < n-i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("   ");
            }

            for(int j = 0; j < i+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern23(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("   ");
            }

            for(int j = 0; j < 2*i+1; j++){
                System.out.print(" 1 ");
            }
            System.out.println();
        }
    }

    public static void pattern24(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("   ");
            }

            for(int j = 0; j < 2*i + 1; j++){
                System.out.print(" "+(i+1)+" ");
            }
            System.out.println();
        }
    }

    public static void pattern25(int n){
        int count = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("   ");
            }

            for(int j = 0; j < 2*i+1; j++){
                if(count < 10){
                    System.out.print("  "+ count++ +" ");
                }
                else {
                    System.out.print(" "+ count++ +" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern26(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("   ");
            }
            int count = 1;
            for(int j = 0; j < 2*i+1; j++){
                System.out.print(" " + count++ +" ");
            }
            System.out.println();
        }
    }

    public static void pattern27(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("   ");
            }

            // half pattern
            for(int j = 1; j <= i+1; j++){
                System.out.print(" " +j+ " ");
            }

            // second Half
            for(int j = i; j >= 1; j--){
                System.out.print(" " +j+ " ");
            }
            System.out.println();
        }
    }

    public static void pattern28(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("   ");
            }
            int count = i;
            for(int j = 1; j <= i+1; j++){
                System.out.print(" "+ ++count +" ");
            }
            //count--;
            for(int j = i; j >=1; j--){
                System.out.print(" " + --count +" ");
            }
            System.out.println();
        }
    }

    public static void pattern29(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("   ");
            }

            for(int j = 0; j < 2*i+1; j++){
                if(j == 0 || j == 2*i){
                    System.out.print(" "+(i+1)+" ");
                }
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println( );
        }
    }

    public static void pattern30(int n){
        for(int i = n; i > 0; i--){
            for(int j = n; j > 0; j--){
                System.out.print(" " +j+ " ");
            }
            System.out.println();
        }
    }
}
