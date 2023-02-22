public class Primes {
    public static void main(String[] args) {
        for (int p=2;p<=100;p++){
            if (isPrime(p)) System.out.println(p);
        }
    }
    public static boolean isPrime(int n) {
        for (int i=2; i<n; i++  ) {
            if (n%i==0) return false;
        }
        return true;
    }
}