import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanez = new Scanner(System.in);
        System.out.println("introdu varsta fetitei");
        int x= scanez.nextInt();
        System.out.println("introdu carsta fetitei");4
        String y = scanez.next ();


//
        Fetita alina = new Fetita();



        alina.nume="Alina";
        alina.varsta=13;
        alina.nationaltate="romnana";

        Fetita andreea = new Fetita();

        andreea.nume="Andreea";
        andreea.varsta=10;
        andreea.nationaltate="romnana";

        Fetita denisa = new Fetita();

        denisa.nume="Alina";
        denisa.varsta=13;
        denisa.nationaltate="romnana";









    }

    public static double divide(double x, double y) {

        double rezultatD = x / y;
        return rezultatD;
    }


    public static int ex4a (int q, int w, int e) {

        int rezultat4a = -q + w * e;
        return rezultat4a;
    }
    public static int ex4b (int r, int t, int y) {

        int rezultat4b = (r+t) % y;
        return rezultat4b;
    }
    public static int ex4c (int u, int i, int o, int p) {

        int rezultat4c = u + (-i*o) / p;
        return rezultat4c;
    }

    public static int ex4d (int a, int s, int d, int f,int g, int h) {

        int rezultat4c = a + s / d * f - g % h;
        return rezultat4c;
    }
}
