package old_stuff;

import java.util.Arrays;

public class ArrayManipulation {


    public static void main(String [] args){


        // Define an array
        //int[] nums = new int[5];
        int[] nums = {1, 2, 3, 4, 5};
        // Get its length
        int len = nums.length;


        //for each loop trough array
        // beware, you cant manipulate the array using this kind of loop!
        int[] nums2 = new int[3];
        nums2[0] = 1;
        for(int n : nums2){
            System.out.println(n);
        }


        //Copy and new length
        int[] nums3 = {1,1,2,2};
        nums3 = Arrays.copyOf(nums3, 2 * nums3.length);
        //Print out array
        String to_print = Arrays.toString(Arrays.copyOf(nums3, nums3.length));
        System.out.println(to_print);

    }
}
