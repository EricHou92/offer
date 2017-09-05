package A4_SeekJob.JingDong;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/4/7.
 */
public class N17_HitCar {

    //运输车相对位置不变，看成运输车不动，激光炮动，枚举放激光炮的地方
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] x_array = new int[n];
            int[] y_array = new int[n];
            for (int i=0; i<n; i++) {
                x_array[i] = scanner.nextInt();
                y_array[i] = x_array[i] + scanner.nextInt();
            }
            int result = 0;
            for (int i=0; i<n; i++){ //第一炮
                for (int j=i+1; j<n; j++){ //第二炮
                    if(getCar(x_array, y_array, x_array[i], x_array[j]) > result)
                        result = getCar(x_array, y_array, x_array[i], x_array[j]);
                }
            }
            System.out.println(result);
        }
    }

    private static int getCar(int[] x_array, int[] y_array, int first, int second) {
        int count = 0;
        for(int i=0; i<x_array.length; i++){
            if( (x_array[i]<=first && first<=y_array[i]) || (x_array[i]<=second && second<=y_array[i]) )
                count++;
        }
        return count;
    }
}
