package A1_JianzhiOffer.T2_String;

/**
 * Created by ciciya on 2017/2/28.
 */
public class N38_1_ReverseSentence {

    //输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变，例如 “student. a am I” -> “I am a student.”
    public String ReverseSentence(String str){
        String[] strings = str.trim().split(" +"); //中间连续两个空格
        StringBuilder sb = new StringBuilder();
        for(int i=strings.length-1; i>0; i--){
            sb.append(strings[i] + " ");
        }
        sb.append(strings[0]);
        return sb.toString();
    }
}
