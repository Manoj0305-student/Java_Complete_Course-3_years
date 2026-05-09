public class Calculator_problem {

  public static void main(String args[]) {
    int num1 = 7;
    int num2 = 3;
    String again = "y";
    char operator = '*';

    magicCalculator(num1, num2, again, operator);
  }

  public static void magicCalculator(int a,int b, String str, char ops) {

    while (str == "y" && ops != 0) {
      if (b == 0) {
        System.out.println("Cannot divide a number with the Zero.");
      }

      if( ops == '+') {
        System.out.println("Result: "+ (a+b));
        str = "n";
      } else if (ops == '-') {
        System.out.println("Result: "+ (a-b));
        str = "n";
      } else if (ops == '*') {
        System.out.println("Result: "+ (a*b));
        str = "n";
      } else if (ops == '/') {
        System.out.println("Result: "+ (a/b));
        str = "n";
      }
       System.out.println("Thank you for using the calculator.");
    }

  }
  
}
