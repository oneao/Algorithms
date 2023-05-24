package cn.oneao;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 */
public class leetCode7 {
    public static void main(String[] args) {
        int reverse = reverse(1534236469);
        System.out.println(reverse);
    }
    public static int reverse(int x) {
        char[] chars = Integer.valueOf(x).toString().toCharArray();
        char[] new_chars = new char[chars.length];
        for (int i = 0;i < chars.length;i++){
            new_chars[chars.length - 1 -i] = chars[i];
        }
        if (new_chars[new_chars.length - 1] == '-'){
            String str = new String(new_chars).substring(0, new_chars.length - 1) ;
            System.out.println(str);
            long anInt = Long.parseLong(str);
            if(anInt < Integer.MIN_VALUE || anInt > Integer.MAX_VALUE){
                return -1;
            }
            return -(int) anInt;
        }else {
            String str = new String(new_chars);
            long anInt = Long.parseLong(str);
            if(anInt < Integer.MIN_VALUE || anInt > Integer.MAX_VALUE){
                return -1;
            }
            return (int) anInt;
        }
    }
    public static int reverse1(int x){
        int target = 0;
        while (x != 0){
            if (target < Integer.MIN_VALUE / 10 || target > Integer.MAX_VALUE / 10){
                return 0;
            }
            int num = x % 10;
            x = x / 10;
            target = target * 10 + num;
        }
        return target;
    }
}
