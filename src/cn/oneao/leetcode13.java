package cn.oneao;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. 罗马数字转整数
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 */
public class leetcode13 {
    public static void main(String[] args) {
        int roman = romanToInt("MCMXCIV");
        System.out.println(roman);
    }
    public static int romanToInt(String s) {
        int sum = 0;    //总数
        int preNum = getValue(s.charAt(0)); //preNum:代表前面的值
        for (int i = 1; i < s.length(); i++) {
            int num = getValue(s.charAt(i));
            if (preNum < num){  //如果前面那个值小于该索引值，则对 - preNum
                sum -= preNum;
            }else {
                sum += preNum;  //如果前面那个值大于该索引值，则对 + preNum
            }
            preNum = num;
        }
        //最后一个索引值，永远是正的
        sum += preNum;
        return sum;
    }
    private static int getValue(char ch){
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
