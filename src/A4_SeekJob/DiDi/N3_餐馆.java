package A4_SeekJob.DiDi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ciciya on 2017/8/26.
 */
public class N3_餐馆 {

    //基本思路就是：桌子序列升序排列，客人按照预定花钱多少降序排序，然后贪心法从钱多的客人开始招呼
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();  // n table
            int m = scanner.nextInt();  // m customers
            int[] table = new int[n];
            for(int i=0;i<n;i++)
                table[i]=scanner.nextInt();  // volume of a table
            int[][] cus = new int[m][2];
            for(int j=0;j<m;j++){
                cus[j][0]=scanner.nextInt(); // number of customers
                cus[j][1]=scanner.nextInt(); // money
            }
            Arrays.sort(table);
            Arrays.sort(cus, (a, b) -> b[1]-a[1]);
            long result = 0L;
            int index = 0;
            boolean[] tableb = new boolean[n];
            for(int i=0; i<m; i++){
                if(cus[i][0]>table[n-1])
                    continue;
                index = binarySearch(table,cus[i][0]);
                while(index<n && tableb[index])
                    index++;
                if(index<n){
                    result += cus[i][1];
                    tableb[index]=true;
                }
            }
            System.out.println(result);
        }
    }

    private static int binarySearch(int[] num, int target){
        int low=0;
        int high=num.length-1;
        while(low<=high){
            int mid=(high+low)>>1;
            if(num[mid]>=target)
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }

}
