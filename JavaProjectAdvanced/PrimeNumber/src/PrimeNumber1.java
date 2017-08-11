import java.util.ArrayList;

public class PrimeNumber1 {

    public boolean checkIfPrime(ArrayList<Integer> primes, int n) {

        int sqrt = (int) Math.sqrt(n);

        for(int prime : primes) {

            if((n % prime) == 0) {
                return false;
            } else if(prime >= sqrt) {
                break;
            }
        }

        return true;

    }

    public void totalPrimes(int checkUntil) {

        int count = 0;
        ArrayList<Integer> primes = new ArrayList<>();

        for(int i=2; i<checkUntil; i++) {
            boolean prime = checkIfPrime(primes, i);
            if(prime) {
                count++;
                primes.add(i);
            }
        }

        System.out.println("Total Prime Numbers Till " + checkUntil + " Is " + count);


    }

    public static void main(String[] args) {

        long startTime = System.nanoTime();


        PrimeNumber1 p1 = new PrimeNumber1();
        p1.totalPrimes(3000000);


        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        long sec = 1000000000;
        System.out.println(elapsedTime/sec + " seconds.");



    }


}
