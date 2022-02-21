package A1_JianzhiOffer.T2_String;

import java.util.*;

/**
 * Created by ciciya on 2017/2/21.
 */
public class N24_Permutation {

    //有重复, 输出字符串;   输入一个字符串,按字典序打印出该字符串中字符的所有排列。
    public ArrayList<String> Permutation(String str){
        ArrayList<String> list = new ArrayList<>();
        char[] chars = str.toCharArray();
        Arrays.sort(chars); //先排序
        backtrack(list, new ArrayList<>(), chars, new boolean[chars.length]);
        return list;
    }

    private void backtrack(List<String> list, List<Character> tempList, char[] chars, boolean[] used){
        if(tempList.size() == chars.length){
            String string = "";
            for(Character i : new ArrayList<>(tempList))
                string += i;
            list.add(string);
        } else{
            for(int i = 0; i < chars.length; i++){
                if(used[i] || (i > 0 && chars[i] == chars[i-1] && !used[i - 1]))
                    continue;
                used[i] = true;
                tempList.add(chars[i]);
                backtrack(list, tempList, chars, used);
                used[i] = false; //条件不符合，该字符还原为未访问过的标记， 回溯的本质就是标记后再去标记，以返回最初的状态
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
