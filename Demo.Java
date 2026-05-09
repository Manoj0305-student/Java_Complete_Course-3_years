class Demo {
    public static void main(String a[]) {
        int x=9,y=3, z=14;
        compareTwoValues(x,y);
        compareThreeValues(x,y,z);
        ternaryOps(x);
    }

    public static void compareTwoValues(int x,int y) {

        System.out.println("Comparing Two Values");
        if(x>y) {
            System.out.println("x: "+x);
        }
            
        else
            System.out.println(y);
    }

    public static void compareThreeValues(int x,int y,int z) {

        System.out.println("Comparing Three Values");
        if(x>y && x>z) {
            System.out.println("x: "+x);
        }
            
        else if(y>z)
            System.out.println("y: "+y);
        else
            System.out.println("z: "+z);
    }

    public static void ternaryOps(int a) {
        String result = a%2 == 0 ? "Even number: "+a : "Odd number: "+a;
        System.out.println("Printing Even or Odd number--> "+result);
    }
}