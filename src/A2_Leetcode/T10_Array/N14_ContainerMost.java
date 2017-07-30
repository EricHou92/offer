package A2_Leetcode.T10_Array;

/**
 * Created by ciciya on 2017/6/11.
 */
public class N14_ContainerMost {

    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int result = 0;
        while (low < high) {
            result = Math.max(result, Math.min(height[low], height[high]) * (high - low));
            if (height[low] < height[high])
                low++;
            else
                high--;
        }
        return result;
    }
}
