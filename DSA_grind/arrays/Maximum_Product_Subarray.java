package arrays;
import java.util.*;
class Maximum_Product_Subarray {
    int maxProduct(int[] arr) {
        Arrays.sort(arr);
        int p_max = arr[0];
        int c_max = arr[0];
        for (int i=1; i<arr.length -2 ; i++){
            int sp = arr[0]*arr[i];
            p_max = Math.max(c_max, sp);
        }
        return p_max;
    }
    public static void main(String[] args) {
        Maximum_Product_Subarray mps = new Maximum_Product_Subarray();
        int[] arr = {1, -2, -3, 0, 7, -8, -2};
        System.out.println(mps.maxProduct(arr));
    }
    
}