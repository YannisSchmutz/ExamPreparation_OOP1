package arrays;

public class SimpleArrays {

    /*
    Returns the difference between the lowest and the highest number in a given array.
     */
    public int bigDiff(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int n : nums){
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return Math.abs(max-min);
    }

    public static void main(String args[]){

    }
}
