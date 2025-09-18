package arrays;
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

    }

    public static void main(String[] args) {
        func_1();
        func_2();
    }
}