package A5_SeekJob.HuaWei;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/3/20.
 */
public class M1_MaxScore {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num_stu = scanner.nextInt();
            int num_oper = scanner.nextInt();
            int[] stus = new int[num_stu];
            for(int i=0; i<num_stu; i++){
                stus[i] = scanner.nextInt();
            }
            for(int i=0; i<num_oper; i++){
                String oper = scanner.next();
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                process(oper, a, b, stus);
            }
        }
    }

    private static void process(String oper, int a, int b, int[] stus) {
        int result = 0;
        if(oper.equals("Q")) {
            int start = Math.min(a, b) - 1;
            int end = Math.max(a, b);
            for(int i=start; i<end; i++){
                if(stus[i]>result)
                    result = stus[i];
            }
            System.out.println(result);
        }
        else if(oper.equals("U"))
            stus[a-1] = b;
    }
}
