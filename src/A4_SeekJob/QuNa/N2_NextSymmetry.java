package A4_SeekJob.QuNa;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/4/9.
 */
public class N2_NextSymmetry {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int number = scanner.nextInt()+1;
            String string = String.valueOf(number);
            while (!isSymmetry(string)){
                number++;
                string = String.valueOf(number);
            }
            System.out.println(number);
        }
    }

    private static boolean isSymmetry(String string){
        String newString = new StringBuffer(string).reverse().toString();
        if(string.equals(newString))
            return true;
        return false;
    }
}
