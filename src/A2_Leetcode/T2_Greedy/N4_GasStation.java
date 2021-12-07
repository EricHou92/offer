package A2_Leetcode.T2_Greedy;

/**
 * Created by ciciya on 2017/4/5.
 */
public class N4_GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int total = 0;
        int res = -1;
        for (int i=0; i<gas.length; i++) {
            sum += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if(sum < 0) {   //之前的油量不够到达当前加油站
                res = i;
                sum = 0;
            }
        }
        if (total < 0)
            return -1;    //所有加油站的油量都不够整个路程的消耗
        else
            return res + 1;
    }
}
