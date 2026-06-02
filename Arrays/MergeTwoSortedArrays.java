package Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {

  static void mergeArraysWithoutAnExtraSpace(int arr1[],int arr2[]) {
    int n = arr1.length-1;
    int j = 0;

    for(int i = n; i>=0; i--) {

      if(arr1[i]>arr2[j]) {

        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
        j++;

      } else {
        break;
      }
    }

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    System.out.println("First Array: "+Arrays.toString(arr1));
    System.out.println("Second Array: "+Arrays.toString(arr2));
}

public static void main(String[] args) {
  int arr1[] = {1, 3, 5, 7};
  int arr2[] = {2, 4, 6, 8};
  mergeArraysWithoutAnExtraSpace(arr1, arr2);
}
  
}
