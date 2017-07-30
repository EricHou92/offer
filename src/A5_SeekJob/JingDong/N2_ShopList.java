package A5_SeekJob.JingDong;

import java.util.*;

/**
 * Created by ciciya on 2017/4/6.
 */
public class N2_ShopList {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            ArrayList<Integer> price = new ArrayList<>();
            for(int i=0; i<n; i++){
                price.add(scanner.nextInt());
            }
            Collections.sort(price);
            Map<String, Integer> buyList = new HashMap<>();
            for(int i=0; i<m; i++){
                String goods = scanner.next();
                if(buyList.containsKey(goods)){
                    int count = buyList.get(goods);
                    buyList.put(goods, ++count);
                }
                else{
                    buyList.put(goods, 1);
                }
            }
            ArrayList<Integer> values = new ArrayList<>(buyList.values());
            Collections.sort(values);
            int minCost = 0;
            int maxCount = 0;
            for(int i=0; i<values.size(); i++){
                minCost += values.get(values.size()-1-i)*price.get(i);
                maxCount += values.get(values.size()-1-i)*price.get(price.size()-1-i);
            }
            System.out.printf(minCost + " " + maxCount + "\n");
        }
    }
}
