package Arrays;

import java.util.Arrays;

public class MovingZerosAtEnd {
	static void movingZeros(int arr[]) {
        int j =0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println("Moving Arrays to the end: "+Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr [] = {0,  1,  0,  3,  12};
        movingZeros(arr);
    }
}
    
