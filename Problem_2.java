public class Problem_2 {

    public static void main(String[] args) {

        // Print numbers 1 to 5 using for loop
        int i=1;
        System.out.print("For Loop:");
        for(;i<=5;i++) {
            System.out.print(" "+i);
        }
        System.out.print(" ");

        // Print numbers 1 to 5 using for while loop
        int j =1;
        System.out.print("While Loop:");
        while(j<=5) {
           System.out.print(" "+j);
           j++; 
        }
        System.out.print(" ");

        // Print numbers 1 to 5 using for while loop
        int k =1;
        System.out.print("Do-While Loop:");
        do { 
            System.out.print(" "+k);
            k++; 
        } while (k<=5);
    }
    
}
