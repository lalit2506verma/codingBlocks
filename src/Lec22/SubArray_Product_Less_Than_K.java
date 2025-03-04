package Lec22;

public class SubArray_Product_Less_Than_K {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};
        int k = 10;
        System.out.println(Product_Less_Than_K(arr,k));
    }

    public static int Product_Less_Than_K(int[] arr, int k){
        int s = 0, e = 0, p = 1, ans = 0;
        while(e < arr.length){
            p *= arr[s];

            while(p >= k){
                p /= arr[s];
                s++;
            }

            //ans update
            ans += (e - s + 1);
            e++;
        }

        return ans;
    }
}
