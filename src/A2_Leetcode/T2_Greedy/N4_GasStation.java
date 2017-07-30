package A2_Leetcode.T2_Greedy;

/**
 * Created by ciciya on 2017/4/5.
 */
public class N4_GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int total = 0;
        int j = -1;
        for (int i=0; i<gas.length; i++) {
            sum += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if(sum < 0) {   //之前的油量不够到达当前加油站
                j = i;
                sum = 0;
            }
        }
        //If the total number of gas is bigger than the total number of cost.
        //There must be a solution.
        if (total < 0)
            return -1;    //所有加油站的油量都不够整个路程的消耗
        else
            return j + 1;
    }
}
