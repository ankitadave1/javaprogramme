package HomeWork14;

public class RunTest {

    public static void main(String[] args){

        Banana B = new Banana();
        B.Taste = "Sweet";
        B.Colour = "Yellow";
        System.out.println(B.Colour + " " + B.Taste);

        B.getPrice();


        Grapes G = new Grapes();
        G.Taste = "Sweet And Sour";
        G.Colour = "Green";
        System.out.println(G.Colour + " " + G.Taste);

        G.getPrice();


        Orange O = new Orange();
        O.Taste = "Sour";
        O.Colour = "Orange";
        System.out.println(O.Colour +" "+ O.Taste);

        O.getPrice();

    }
}
