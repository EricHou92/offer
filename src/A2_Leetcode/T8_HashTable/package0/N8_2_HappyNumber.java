package A2_Leetcode.T8_HashTable.package0;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ciciya on 2017/5/18.
 */
public class N8_2_HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (set.add(n)) {
            int squareSum = 0;
            while (n > 0) {
                int remain = n%10;
                squareSum += remain*remain;
                n /= 10;
            }
            if (squareSum == 1)
                return true;
            else
                n = squareSum;
        }
        return false;
    }
}
