package algorithms;

/*
* Prime
*
*
*
*
 */

public class IsPrime {


    public static boolean isPrime(int n) {
        int i = 1;
        while (true) {
            System.out.println("\ni: " + i);
            i++;
            if (i > Math.sqrt(n)) {
                System.out.println(String.format("Break. I: %d, sqrt-n: %f", i, Math.sqrt(n)));
                break;
            }
            if (i != 2 && i % 2 == 0) {
                System.out.println("Continue");
                continue;
            }
            if (n % i == 0) {
                System.out.println(String.format("Is not prime! N: %d, found divisor -> I: %d", n, i));
                return false;
            }
        }
        System.out.println("Is prime!");
        return true;
    }



    public static void main(String args[]) {
        System.out.println("Start isPrime");
        isPrime(83);
    }

}
