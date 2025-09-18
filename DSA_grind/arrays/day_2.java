package arrays;

import java.util.HashSet;
import java.util.Set;

public class day_2 {
    static void func_1(){
        int[] arr = {1, 2, 3, 6, 4};
        boolean check = true;
        for(int i=1;i<arr.length;i++){
            if (arr[i] < arr[i-1]) check = false;
        }
        if (check) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    static void func_2(){

        // removing duplicates from sorted array
        int[] arr = {1,1,2,2,2,2,2,3,3,3,4,4,4,4,4};
        //brute force
        // via a set
        int n = arr.length;
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(arr[i]);
        }
        for(int num : s){
            System.out.print(num+" ");
        }
        System.out.println("");
    }

    static void q2_optimized(){
        int[] arr = {1,1,2,2,2,2,2,3,3,3,4,4,4,4,4};
        int n = arr.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i] == arr[j]){
                arr[i+1] = arr[j];
            }
            else{
                i++;
                arr[i] = arr[j];
            }
        }
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }
    System.out.println(" ");
    }

    public static void main(String[] args) {
        func_1();
        func_2();
        q2_optimized();
    }
}