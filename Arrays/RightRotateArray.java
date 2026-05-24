package Arrays;

import java.util.Arrays;

public class RightRotateArray {

    public static int[] rightRotate(int arr[], int k) {
        int n = arr.length;
        int temp[] = new int[k];

        k=k%n;

        if(k==0) return arr;

        for(int i=0;i<k;i++) {
            temp[i] = arr[n-k+i];
        }

        for(int i=n-k-1;i>=0;i--) {
            arr[i+k] = arr[i];
        }

        for(int i=0;i<k;i++) {
            arr[i]=temp[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int result[] = rightRotate(arr, 2);
        System.out.println(Arrays.toString(result));
    }
    
}
