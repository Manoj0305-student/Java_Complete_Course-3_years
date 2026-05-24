package Array_Problems;

import java.util.Arrays;

public class LeftRotateArray {

    public static int [] leftRotate(int arr1[], int k) {

        int n = arr1.length;
        k= k%n;
        if(k==0) return arr1;

        int temp[] = new int[k];

        for(int i=0;i<k;i++) {
            temp[i] = arr1[i];
        }

        for(int i=k;i<n;i++) {
            arr1[i-k] = arr1[i];
        }

        for(int i =0;i<k;i++) {
            arr1[n-k+i] = temp[i];
        }

        return arr1;
    }

    public static int [] leftro(int arr2[], int k){
        int temp,j;
        for(int i=0;i<k;i++){
            temp=arr2[0];
            for(j=0;j<arr2.length-1;j++){
                arr2[j]=arr2[j+1];
            }
            arr2[j]=temp;
        }
        return arr2;
    }

    public static void main(String args[]) {
        int[]arr1 = {1,2,3,4,5};
        int[]arr2 = {1,2,3,4,5};
        int[] result1=leftro(arr1, 2);
         int[] result2=leftRotate(arr2, 2);
        System.out.println("Left Rotate1: "+Arrays.toString(result1));
        System.out.println("Left Rotate2: "+Arrays.toString(result2));
    }
    
}
