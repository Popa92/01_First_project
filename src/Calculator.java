public class Calculator {
    public boolean checkNumberIfIsN (double N){
        if (N>=0 && (N % 1 == 0|| N % 2 ==0 )){
            return true;
        }
        else {
            return false;
        }
    }
}
