package A1_JianzhiOffer.T3_LinkedList;

import java.util.LinkedList;

/**
 * Created by ciciya on 2017/3/2.
 */
public class N41_LastRemaining {

    //约瑟夫环问题, 最后一个剩下的数字
    public int LastRemaining_Solution(int n, int m) {
        if(n<1 || m<1)
            return -1;
        int result = 0;
        for(int i=2; i<=n; i++)
            result = (result+m)%i;
        return result;
    }

    public int LastRemaining_SolutionI(int n, int m) {
        //模拟游戏过程：
        LinkedList<Integer> list = new LinkedList<>();  //双向链表
        for (int i = 0; i < n; i++)
            list.add(i);
        int drop = 0;
        while (list.size() > 1) {
            drop = (drop + m - 1) % list.size();
            list.remove(drop);
        }
        return list.size() == 1 ? list.get(0) : -1;
    }
}
