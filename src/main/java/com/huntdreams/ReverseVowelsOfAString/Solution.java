package com.huntdreams.ReverseVowelsOfAString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 345. Reverse Vowels of a String
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 4/25/16 4:52 PM.
 */
public class Solution {

    private Set<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    private boolean isVowels(char c) {
        return vowels.contains(c);
    }

    private void swap(char[] s, int i, int j) {
        char c = s[i];
        s[i] = s[j];
        s[j] = c;
    }

    public String reverseVowels(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        char[] seq = s.toCharArray();
        int start = 0, last = s.length() - 1;
        while (start < last) {
            if (!isVowels(seq[start])) {
                start++;
            } else if (!isVowels(seq[last])) {
                last--;
            } else {
                swap(seq, start++, last--);
            }
        }
        return new String(seq);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "hello";
        s = solution.reverseVowels(s);
        System.out.println(s);
    }
}
