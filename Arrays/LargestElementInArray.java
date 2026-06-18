package Arrays;

public class LargestElementInArray {
    
    public static int LargestElement(int arr[]) {

        int largestEle = arr[0];
        for(int i=0;i<arr.length;i++) {
            if(largestEle < arr[i]) {
                largestEle = arr[i];
            }
        }

        return largestEle;
    }

    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5};
        System.out.println(LargestElement(arr));
    }
        
}
