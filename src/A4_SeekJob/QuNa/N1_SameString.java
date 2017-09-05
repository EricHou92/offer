package A4_SeekJob.QuNa;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ciciya on 2017/4/9.
 */
public class N1_SameString {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String string1 = scanner.next();
            String string2 = scanner.next();
            char[] array1 = string1.toCharArray();
            char[] array2 = string2.toCharArray();
            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();
            boolean result = false;
            for(int i=0; i<array1.length; i++)
                map1.put(array1[i], 1);
            for(int i=0; i<array2.length; i++)
                map2.put(array2[i], 1);
            if(map1.equals(map2))
                result = true;
            System.out.println(result);
        }
    }
}
