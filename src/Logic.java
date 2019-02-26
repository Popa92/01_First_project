import java.util.Scanner;

public class Logic extends Calculator {


    public void checkNumber(int x, int y) {

        if (x < y) {
            System.out.println("x este mai mic");
        } else if (x == y) {
            System.out.println("x=y");
        } else {
            System.out.println("y este mai mare ca si x");
        }
    }


    public void compareStrings(String a, String b){
        if(a.contentEquals(b)){
            System.out.println("Strings match");
        }
        else {
            System.out.println("The strings don't match");
        }
    }

    public void exercitiu3 (double nr){
        Calculator calc = new Calculator();
        if (calc.checkNumberIfIsN(nr) && nr >= 2 && nr <= 8){
            System.out.println(nr);
        }
        else {
            System.out.println("Numarul nu corespunde");
        }
       }
    public void compareStringsAndNR(String c, String d){
        if(c.contentEquals(d)){
            System.out.println("Strings match");
            if ()
        }
        else {
            System.out.println("The strings don't match");
        }
    }


    }

