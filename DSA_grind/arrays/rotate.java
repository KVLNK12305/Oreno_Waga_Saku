package arrays;

public class rotate {
    static void q1(){
        // left rotate by 1 place without 2nd array
        int arr[] = {1,2,3,4,5}; 
        System.out.println("before rotationg: ");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }    
        System.out.println();

        int temp = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];  
        }

        arr[arr.length - 1] = temp; 

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        q1();
    }
}
