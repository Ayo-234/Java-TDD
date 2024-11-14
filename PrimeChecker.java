
public class PrimeChecker { 
    public static boolean isPrime(int x){
        
        if (x % 2 != 0) {
            return true;
        }
        else if (x == 2){
            return true;
        }
        else if (x <= 1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 73;
        System.out.println(isPrime1(x));
    }
}

