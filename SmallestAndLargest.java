public class SmallestAndLargest {

  public static void arrayOfLM(int [] arr)  {
    int min = arr[0];
    int max = arr[0];

    for(int n:arr){
      if(min>n)
        min=n;

      if(max<n)
        max=n;
    }

    System.out.println("Smallest: "+min);
    System.out.println("Largest: "+max);
  }

  public static void main(String args[]) {
    int [] numbers = {33, 45, 57, 16,90, 89};
    arrayOfLM(numbers);
  }
  
}
