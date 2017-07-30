package A2_Leetcode.T8_HashTable.package0;

/**
 * Created by ciciya on 2017/5/18.
 */
public class N8_1_CountPrimes {

    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true; //素数所有的倍数均为非素数
                }
            }
        }
        return count;
    }
}
