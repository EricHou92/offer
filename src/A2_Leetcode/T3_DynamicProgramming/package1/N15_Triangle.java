package A2_Leetcode.T3_DynamicProgramming.package1;

import java.util.List;

/**
 * Created by ciciya on 2017/3/27.
 */
public class N15_Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        int[] A = new int[triangle.size()+1];
        for(int i=triangle.size()-1; i>=0; i--){
            for(int j=0; j<triangle.get(i).size(); j++){
                A[j] = Math.min(A[j],A[j+1]) + triangle.get(i).get(j);
            }
        }
        return A[0];
    }
}
