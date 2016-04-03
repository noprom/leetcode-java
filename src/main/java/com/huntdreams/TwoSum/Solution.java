package com.huntdreams.TwoSum;

/**
 * 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 4/3/16 5:08 PM.
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int length = nums.length;
        boolean flag = false;
        for (int i = 0; i < length; i++) {
            if (flag) {
                break;
            }
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    flag = true;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("result:" + result[0] + "," + result[1]);
    }
}
