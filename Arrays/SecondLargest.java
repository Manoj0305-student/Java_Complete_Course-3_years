package Arrays;

import java.util.Arrays;

public class SecondLargest {

  public static int findSecondLargest(int[]arr) {

    int largest = arr[0];
    int secLargest = Integer.MIN_VALUE;

    if(arr.length == 1)
      throw new IllegalArgumentException("Array contains only one element.");

    int distinctCount = Arrays.stream(arr).distinct().count() == 1 ? 0:1;

    if (distinctCount == 1) {
      throw new IllegalArgumentException("All elements in the array having same numbers.");
    }

    for(int number:arr) {

      if(number>largest) {
        secLargest = largest;
        largest = number;
      } else if(number>secLargest && number!=largest) {
        secLargest = number;
      }

    }
    return secLargest;
  }

  public static void main(String args[]) {

    int arrays[] = {12, 35, 1, 10, 34, 1,35};

    try {
      int result = findSecondLargest(arrays);
      System.out.println(result);
    } catch (Exception e) {
      System.out.println("Error "+e.getMessage());
    }
  }
  
}
