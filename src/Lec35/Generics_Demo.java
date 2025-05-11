package Lec35;

public class Generics_Demo {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40};
        Display(arr);

        Character[] arr1 = {'1', '2', '3', '4'};
        Display(arr1);

        String[] arr2 = {"Raj", "Kamlesh", "Ankit", "Ankita"};
        Display(arr2);
    }

    public static <T> void Display(T[] arr){
        for (T t : arr) {
            System.out.print(t + " ");
        }
    }

    public static <T> T get(T[] arr){
        return arr[0];
    }
}
