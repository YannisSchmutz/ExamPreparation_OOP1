package algorithms;

/*
* Array
* For
* For each
* args
*
*
 */

public class SumOfSquares {

    // Being able to pass as much arguments as you wish
    public static int sumOfSquares(int... values) {
        int total = 0;

        // Loop trough array, you can not modify it though! "for each" loop
        for (int v : values) {
            System.out.println(String.format("Value: %d", v));
        }

        for (int i = 0; i < values.length; i++) {
            total += values[i] * values[i];
        }
        return total;
    }

    public static void main(String args[]) {
        System.out.println("Start sumOfSquares");

        int sum = sumOfSquares(3,4,5);

        System.out.println(sum);


    }
}
