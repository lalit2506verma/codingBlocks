package Lec12;

public class Wave_Print {

    public static void main(String[] args) {
        int[] [] arr = {{1,4,7,11,15},{4,5,6,13,21},{21,22,23,24}, {}};

        Print(arr);
    }

    public static void Print(int[][] arr){

        for(int i = 0; i < arr[0].length; i++){

            if(i % 2 == 0){
                for(int j = 0; j < arr.length; j++){
                    System.out.print(arr[j][i] + " ");
                }
            }
            else{
                for(int j = arr.length-1; j >= 0; j--){
                    System.out.print(arr[j][i] + " ");
                }
            }

            System.out.println();
        }
    }
}
