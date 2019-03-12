public class Calculator {


    public boolean checkNumberIfIsN(double N) {
        if (N >= 0 && (N % 1 == 0 || N % 2 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public void sumAndAverage() {
        int s = 0;
        int a = 0;
        int n = 0;
        for (int i = 1; i <= 100; i++) {
            s += i;
            n++;
        }
        a = s / n;
        System.out.println(s);
        System.out.println(a);
    }
}
