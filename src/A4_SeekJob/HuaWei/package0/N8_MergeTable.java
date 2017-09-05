package A4_SeekJob.HuaWei.package0;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class N8_MergeTable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int num = scanner.nextInt();
			//Map<Integer, Integer> hashMap = new HashMap<>();
			Map<Integer, Integer> hashMap = new TreeMap<>();
			for(int i=0; i<num; i++){
				int key = scanner.nextInt();
				int value = scanner.nextInt();
				if(hashMap.containsKey(key)){
					value += hashMap.get(key);
					hashMap.put(key, value);
				}else
					hashMap.put(key, value);
			}
			for(Integer i : hashMap.keySet())
				System.out.println(i + " " + hashMap.get(i));
				
		}
	}
}
