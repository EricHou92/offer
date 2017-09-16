package A1_JianzhiOffer.T2_String;

/**
 * Created by ciciya on 2017/2/28.
 */
public class N38_1_ReverseSentence {

    //例如“student. a am I”。把句子单词的顺序翻转了，正确的句子是“I am a student.”。
    public String ReverseSentence(String str){
        StringBuilder sb = new StringBuilder();
        String[] strings = str.trim().split(" +"); //中间连续两个空格
        for(int i=strings.length-1; i>0; i--){
            sb.append(strings[i] + " ");
        }
        sb.append(strings[0]);
        return sb.toString();
    }
}
