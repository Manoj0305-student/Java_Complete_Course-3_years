package Array_Problems;

import java.util.Arrays;

public class SecondLargest {

  public static int findSecondLargest(int[]arr) {

    int largest = arr[0];
    int secLargest = arr[0];

    int result = Arrays.stream(arr).distinct().count() == 1 ? 0:1;

    if(arr.length == 1 || result == 0)
      return 0;

    for(int number:arr) {

      if(number>largest) {
        secLargest = largest;
        largest = number;
      }

      if(number>secLargest && number!=largest) {
        secLargest = number;
      }

    }
    return secLargest;
  }

  public static void main(String args[]) {

    int arrays[] = {12, 35, 1, 10, 34, 1,35};

    int result = findSecondLargest(arrays);

    if(result == 0) {
      System.out.println("Array list might contains same numbers or one element");
    } else {
      System.out.println(result);
    }
  }
  
}
