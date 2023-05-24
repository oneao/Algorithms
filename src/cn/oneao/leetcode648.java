package cn.oneao;

import java.util.Collections;
import java.util.List;

/**
 * 648. 单词替换
 * 输入：dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled by the battery"
 * 输出："the cat was rat by the bat"
 * ===============================================
 * 输入：dictionary = ["a","b","c"], sentence = "aadsfasf absbs bbab cadsfafs"
 * 输出："a a b c"
 * 你需要输出替换之后的句子。
 */
public class leetcode648 {
    public String replaceWords(List<String> dictionary, String sentence) {
        //对词典进行重新排序
        Collections.sort(dictionary);
        //将句子按照空格进行分隔
        String[] words = sentence.split(" ");
        //遍历每一个单词
        for (int i = 0; i < words.length; i++) {
            for (String root : dictionary) {
                if (words[i].startsWith(root)){ //检查句子中的单词的是否以root开头
                    words[i] = root;    //替换
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }
}
