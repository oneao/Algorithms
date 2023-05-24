package cn.oneao;

/**
 * 剑指 Offer 58 - II. 左旋转字符串
 *
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 */
public class JzOffer58 {
    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        StringBuilder str = new StringBuilder();
        char[] newChars = new char[n];
        for (int i = 0; i < chars.length; i++) {
            if (i < n){
                newChars[i] = chars[i];
            }else {
                str.append(chars[i]);
            }
        }
        for (int i = 0; i < newChars.length; i++) {
            str.append(newChars[i]);
        }
        return str.toString();
    }

    public String reverseLeftWords2(String s, int n) {
        StringBuilder str = new StringBuilder();
        for (int i = n; i < s.length();i++){
            str.append(s.charAt(i));
        }
        for (int i = 0;i < n;i++){
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}
