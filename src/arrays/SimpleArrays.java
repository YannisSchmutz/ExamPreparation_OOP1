package arrays;

/*
* Array
* Copy array
* Reduce array
* Order array
* print array
* Create array
*
 */

import java.lang.reflect.Array;
import java.util.Arrays;

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


    /*
    Creates an array out of all numbers after the last 4 in the original array.

    post4([2, 4, 1, 2]) -> [1, 2]
    post4([4, 1, 4, 2]) -> [2]
     */
    public int[] post4(int[] nums) {
        int last_four_pos = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 4){
                last_four_pos = i;
            }
        }
        int[] new_array = Arrays.copyOfRange(nums, last_four_pos+1, nums.length);
        return new_array;

    }


    /*
    Puts all zeros in front of a new array
    Order array
    print array
     */
    public static int[] zeroFront(int[] nums) {

        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 0){
                for(int j = i;j>0;j--){
                    arr[j] = arr[j-1];
                }
                arr[0] = 0;
            }else{
                System.out.println(String.format("Add %d at %d", nums[i], i));
                arr[i] = nums[i];
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    /*
    Sorts even numbers before odds in an array
     */
    public static int[] evenOdd(int[] nums) {

        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length;i++){
            if(nums[i] % 2 == 1){
                arr[i] = nums[i];
            } else {
                for(int j = i;j > 0;j--){
                    arr[j] = arr[j-1];
                }
                arr[0] = nums[i];
            }
        }

        return arr;

    }

    /*
     * String array
     * Int to string
     * Create array out of start and end position
     *
     * Fizz-Buzz problem
     */
    public static String[] fizzBuzz(int start, int end) {

        String[] arr = new String[end - start];

        int index = 0;
        for(int i = start; i < end;i++){
            if(i%15 == 0){
                arr[index] = "FizzBuzz";
                index++;
            } else if(i % 5 == 0){
                arr[index] = "Buzz";
                index++;
            } else if(i % 3 == 0){
                arr[index] = "Fizz";
                index++;
            }else {
                arr[index] = String.valueOf(i);
                index++;
            }
        }

        return arr;

    }

    public static void main(String args[]){

        int[] arr = new int[]{1,0,2,0,3,0};
        System.out.println(String.format("Input arr: %s output: %s", Arrays.toString(arr), Arrays.toString(zeroFront(arr))));

    }
}
