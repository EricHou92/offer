package A3_SortSearch;

/**
 * Created by ciciya on 2017/3/28.
 */
public class N4_SimpleInsert {

    public void insertSort(int[] numbers) {
        for(int i=0; i<numbers.length; i++) {
            int j;
            int temp = numbers[i];
            //假如前面的值比temp大，则将前面的值后移
            for(j=i; j>0 && numbers[j-1]>temp; j--) {
                numbers[j] = numbers[j-1];
            }
            numbers[j] = temp;
        }
    }
}
