package A1_JianzhiOffer.T1_Array;

/**
 * Created by ciciya on 2017/2/27.
 */
public class N47_duplicate {
    public boolean duplicate(int[] numbers, int result) {
        /*
        不需要额外的数组或者hash table来保存，题目里写了数组里数字的范围保证在0 ~ n-1 之间，
        所以可以利用现有数组设置标志，当一个数字被访问过后，可以设置对应位上的数 + n，
        之后再遇到相同的数时，会发现对应位上的数已经大于等于n了，那么直接返回这个数即可。
        */
        int len = numbers.length;
        for(int i=0; i<len; i++) {
            int index = numbers[i];
            if (index >= len)
                index -= len;
            if (numbers[index] >= len) {
                result = index;
                return true;
            }else {
                numbers[index] += len;
            }
        }
        return false;
    }
}
