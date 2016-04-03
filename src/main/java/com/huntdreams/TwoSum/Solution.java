package com.huntdreams.TwoSum;

import java.util.HashMap;

/**
 * 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 4/3/16 5:08 PM.
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        // 1. O(n*n)算法,这种太渣了,第二种比较好
//        int[] result = new int[2];
//        int length = nums.length;
//        boolean flag = false;
//        for (int i = 0; i < length; i++) {
//            if (flag) {
//                break;
//            }
//            for (int j = i + 1; j < length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    result[0] = i;
//                    result[1] = j;
//                    flag = true;
//                    break;
//                }
//            }
//        }
//        return result;
        // 2. O(n) 算法,先用一个hashmap存放另一个数的结果和索引;
        // 然后遍历查找,hashmap<nums中的数字,索引>

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // 首先初始化map
        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }
        // 然后遍历nums查找
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(nums[i]);
            if (index != null && index != i) {
                return new int[]{i, index};
            }
        }
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("result:" + result[0] + "," + result[1]);
    }
}
