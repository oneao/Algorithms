package cn.oneao;

/**
 * 剑指 Offer 67. 把字符串转换成整数
 */
public class JzOffer67 {
    public static void main(String[] args) {
    }
    public int strToInt(String str) {
        if (str == null || str.length() == 0){
            return 0;
        }
        char[] chars = str.trim().toCharArray();
        if (chars.length == 0){
            return 0;
        }
        /**
         * sign:表示正负号
         * ans:返回的数值
         * i:索引开始的位置
         * boundary:最大值 / 10
         */
        int sign = 1,i = 0,ans = 0,boundary = Integer.MAX_VALUE / 10;
        if (chars[0] == '-'){
            sign = -1;
            i++;
        }else if (chars[0] == '+'){
            i++;
        }
        for (int j = i;j<chars.length;j++){
            if (chars[j] < '0' || chars[j] > '9'){
                break;
            }
            if (ans > boundary || (ans == boundary && chars[j] > '7')){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = ans * 10 + (chars[j] - '0');
        }
        return sign * ans;
    }
}
