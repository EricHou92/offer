package A2_Leetcode.T8_HashTable.package1;

import java.util.*;

/**
 * Created by ciciya on 2017/5/19.
 */
public class N15_1_InsertDeleteRandom {

    //无重复元素
    List<Integer> list = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    Random random = new Random();
    /** Initialize your data structure here. */
    public N15_1_InsertDeleteRandom() {

    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        boolean contain = map.containsKey(val);
        if (contain)
            return false;
        map.put(val, list.size()); //将每一个新元素放到最后一个
        list.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        boolean contain = map.containsKey(val);
        if (!contain)
            return false;
        int index = map.get(val);
        if (index < list.size()-1) { // not the last one
            int lastOne = list.get(list.size() - 1);
            //交换末尾元素和被删除元素
            list.set(index, lastOne);
            map.put(lastOne, index);
        }
        map.remove(val);
        list.remove(list.size() - 1);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
