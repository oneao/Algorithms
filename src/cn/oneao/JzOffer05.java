package cn.oneao;

/**
 * 剑指 Offer 05. 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"
 */
public class JzOffer05 {
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' '){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }
}
