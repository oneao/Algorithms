package cn.oneao;

/**
 * 796. 旋转字符串
 * 给定两个字符串, s 和 goal。如果在若干次旋转操作之后，s 能变成 goal ，那么返回 true 。
 * s 的 旋转操作 就是将 s 最左边的字符移动到最右边。
 * 例如, 若 s = 'abcde'，在旋转一次之后结果就是'cdeab' 。
 */
public class leetcode796 {
    public static void main(String[] args) {
        boolean b = rotateString("abcde", "cdeab");
        System.out.println(b);
    }
    public static boolean rotateString(String s, String goal) {
        char[] chars = s.toCharArray();
        for (int i = 1; i <= chars.length; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = i; j < chars.length; j++) {
                str.append(chars[j]);
            }
            for (int j = 0; j < i; j++) {
                str.append(chars[j]);
            }
            if (str.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }
}
