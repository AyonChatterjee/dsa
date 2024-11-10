import java.util.*;

public class BubbleSort {
    private static void bubbleSort(int[] arr , int n) {
        for(int i = n - 1 ; i >= 0 ; i--) {
            for(int j = 0 ; j <= i - 1 ; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j] ;
                    arr[j] = arr[j + 1] ;
                    arr[j + 1] = temp ;
                }
            }
        }

        /*
         * TC : O(N^2)
         * SC : O(1)
         */
        
        System.out.print("Sorted Array: ");
        for(int i = 0 ; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {13 , 46 , 25 , 52 , 20 , 9} ;
        int n = arr.length ;
        bubbleSort(arr, n);
     }

     /*
      * Output -  Sorted Array: 9 13 20 25 46 52 
     */
}
