package cn.oneao;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 */
public class leetcode20 {
    public static void main(String[] args) {
        String s = "{[]}";
        boolean valid = isValid1(s);
        System.out.println(valid);
    }
    public static boolean isValid1(String s) {
        while (true){
            int l = s.length();
            s=s.replace("()","");
            s=s.replace("{}","");
            System.out.println(s);
            s=s.replace("[]","");
            if (s.length() == l){
                return l == 0;
            }
        }
    }
    public boolean isValid2(String s) {
        //执行用时：35 ms, 在所有 Java 提交中击败了5.59%的用户
        while(s.contains("()") || s.contains("[]") || s.contains("{}")){
            s=s.replace("()","").replace("[]","").replace("{}","");
        }
        return s.equals("");
    }
    public boolean isValid3(String s){
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            switch (c){
                case '(':{
                    stack.push(')');
                    break;
                }
                case '[':{
                    stack.push(']');
                    break;
                }
                case '{':{
                    stack.push('}');
                    break;
                }
                default:{
                    if(stack.isEmpty() || c!=stack.pop()) return false;
                }
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
