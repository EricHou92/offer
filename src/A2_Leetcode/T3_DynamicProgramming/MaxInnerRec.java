package A2_Leetcode.T3_DynamicProgramming;

/**
 * Created by ciciya on 2017/3/19.
 */
public class MaxInnerRec {

    //动态规划
    public int countArea(int[] A, int n) {
        // write code here
        int i,j,L1,L2,area;
        int max=0;
        for(i=0;i<n;i++)
        {
            L1=0;L2=0;
            for(j=i;j<n;j++)
            {
                if(A[j]>=A[i])
                    L1++;
                else
                    break;
            }
            for(j=i-1;j>=0;--j)
            {
                if(A[j]>=A[i])
                    L2++;
                else
                    break;
            }
            area=(L1+L2)*A[i];
            if(area>max)
                max=area;
        }
        return max;
    }
}
