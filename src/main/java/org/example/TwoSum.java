package org.example;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 5, 4}, 7)));
    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] + nums[i+1] == target){
                return new int[]{i , i+1};
            }
        }
        return new int[]{}; // if no solution found
    }
}
