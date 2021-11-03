package HomeWork14;

public class MethodOverloading {
    //In multiple method by using two method with same data.

    public static int sumMethod(int a, int b){
        return a + b;
    }

    public static double sumMethod(double a, double b){
        return a + b;
    }

    public static void main(String[] args){
        int myObj1 = sumMethod(9,4);
        double myObj2 = sumMethod(2.6, 6.26);
        System.out.println("int: " + myObj1);
        System.out.println("double:" + myObj2);
    }

}
