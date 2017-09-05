package A4_SeekJob.HuaWei.package0;

import java.util.Scanner;
import java.util.TreeSet;

public class N3_RemoveSort {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int n = scanner.nextInt();
			TreeSet<Integer> treeSet = new TreeSet<>();
			for (int i = 0; i < n; i++) {
				treeSet.add(scanner.nextInt());
			}
			for (Integer i : treeSet) {
				System.out.println(i);
			}
		}
	}
}
