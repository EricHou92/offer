package A5_SeekJob.JingDong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ciciya on 2017/4/7.
 */
public class N10_PathMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            String t = scanner.next();
            int diffLR = s.charAt(0) - t.charAt(0);
            int diffUD = s.charAt(1) - t.charAt(1);
            List<String> steps = new ArrayList<>();
            while (diffLR != 0 || diffUD != 0) {
                StringBuffer step = new StringBuffer("");
                if (diffLR < 0) {
                    step.append("R");
                    diffLR++;
                } else if (diffLR > 0) {
                    step.append("L");
                    diffLR--;
                }
                if (diffUD < 0) {
                    step.append("U");
                    diffUD++;
                } else if (diffUD > 0) {
                    step.append("D");
                    diffUD--;
                }
                steps.add(step.toString());
            }
            System.out.println(steps.size());
            for (String step : steps){
                System.out.println(step);
            }
        }
        scanner.close();
    }
}
