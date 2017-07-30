package A1_JianzhiOffer.T2_String;

import java.util.*;

/**
 * Created by ciciya on 2017/2/21.
 */
public class N24_Permutation {

    //有重复, 输出字符串
    public ArrayList<String> Permutation(String str){
        ArrayList<String> list = new ArrayList<>();
        char[] chars = str.toCharArray();
        Arrays.sort(chars); //先排序
        backtrack(list, new ArrayList<>(), chars, new boolean[chars.length]);
        return list;
    }

    private void backtrack(List<String> list, List<Character> tempList, char[] nums, boolean[] used){
        if(tempList.size() == nums.length){
            String string = "";
            for(Character i : new ArrayList<>(tempList)){
                string += i;
            }
            list.add(string);
        } else{
            for(int i = 0; i < nums.length; i++){
                if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1])
                    continue;
                used[i] = true;
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, used);
                used[i] = false;
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
