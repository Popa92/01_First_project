
public class Logic {


    public void checkHigherNumber(int x, int y) {

        if (x < y) {
            System.out.println("x este mai mic");
        } else if (x == y) {
            System.out.println("x=y");
        } else {
            System.out.println("y este mai mare ca si x");
        }
    }


    public boolean compareStrings(String a, String b) {
        if (a.contentEquals(b)) {
            return true;
        } else {
            return false;
        }
    }

    public Fetita cevaMetoda() {
        Fetita asd = new Fetita();
        asd.greutate = 3;
        asd.inaltime = 4;
        return asd;
    }


    public void exercitiu3(double nr) {
        Calculator calc = new Calculator();
        if (calc.checkNumberIfIsN(nr) && nr >= 2 && nr <= 8) {
            System.out.println(nr);
        } else {
            System.out.println("Numarul nu corespunde");
        }
    }

    public void compareStringsAndNR(String c, String d, int e) {
        if (c.contentEquals(d)) {
            System.out.println("Strings match");
            if ((c.contentEquals(d)) && (e < 3)) {
            } else {
                System.out.println("The strings don't match");
            }
        }


    }

    public void countBackwards(int q, int w) {
        for (int i = q; i >= w; i--) {
            System.out.println(i);
        }
    }

    public void sumAndAverageHundred(int i) {
        int rezultat = 0;
        while (i <= 100) {
            if (i % 2 != 0) {
                rezultat = rezultat + i;

            }
            i++;

        }
        System.out.println(rezultat);
    }

    public void printStars() {
        for (int j = 1; j <= 7; j++) {
            for (int i = 1; i <= 8 - j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public double sumAndAverageHundredWhile() {
        double i = 1;
        double j = 0;
        double k = 0;
        double rezultat;
        while (i <= 100) {
            j = j + i;
            k = k + 1;
            i++;
        }
        rezultat = j / k;
        return rezultat;


    }

    public double sumAndAverageXtoY() {
        double i = 111;
        double j = 0;
        double k = 0;
        double rezultat;
        while (i <= 8899) {
            j = j + i;
            k = k + 1;
            i++;
        }
        rezultat = j / k;
        return rezultat;


    }

    public void coza() {
        for (int i = 1; i <= 110; i++) {

            if (i % 11 == 0) {
                System.out.println(i);
            }else
            System.out.print(i + " ");
        }
    }


}



