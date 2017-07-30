package A3_SortSearch;

/**
 * Created by ciciya on 2017/3/28.
 */
public class N4_SimpleSelect {

    public void selectSort(int[] numbers) {
        for(int i=0; i<numbers.length; i++) {
            int k = i;   //待确定的位置
            //选出最小的一个数与第一个位置的数交换；然后在剩下的数当中再找最小的与第二个位置的数交换
            for(int j=numbers.length-1; j>i; j--) {
                if(numbers[j] < numbers[k]) {
                    k = j;
                }
            }
            //交换两个数
            int temp = numbers[i];
            numbers[i] = numbers[k];
            numbers[k] = temp;
        }
    }
}
