package cn.oneao;

/**
 * 9. 回文数
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 例如，121 是回文，而 123 不是。
 */
public class leetcode9 {
    public static void main(String[] args) {
        boolean result = isPalindrome(111);
        System.out.println(result);
    }

    public static boolean isPalindrome(int x) {
        int y = x;
        if (x < 0) {
            return false;
        }
        if (x == 1) {
            return true;
        }
        int num = 0;
        while (x > 0) {
            int mid = x % 10;
            x = x / 10;
            num = num * 10 + mid;
            if (x >= 0 && x <= 9) {
                num = num * 10 + x;
                break;
            }
        }
        if (num == y) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindrome2(int x) {
        if(x < 0){
            return false;
        }
        int cur = 0;
        int num = x;
        while (num != 0){
            cur = cur * 10 + num % 10;
            num /= 10;
        }
        return cur == x;

    }
}