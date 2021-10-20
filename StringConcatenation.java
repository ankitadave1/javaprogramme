


package HomeWork;

public class StringConcatenation {

    //Concatenation means to add 2 things together - joining 2 or more String togethers

    public static void main(String[] args){

        String x = "Hello";
        String y ="Java";

        int a = 100;
        int b = 200;

        System.out.println(x+y); //HelloJava
        System.out.println("x+Y"); //x+y

        System.out.println(a+b); //300
        System.out.println(a+x); //100Hello

        System.out.println(a+b+x+y); //300HelloJava
        System.out.println(x+y+a); //HelloJava100

        System.out.println(x+y+a+b); //HelloJava100200
        System.out.println(x+y+(a+b)); //HelloJava300

    }
}
