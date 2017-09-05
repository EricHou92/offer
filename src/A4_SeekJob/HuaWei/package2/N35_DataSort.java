package A4_SeekJob.HuaWei.package2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class N35_DataSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()){
			String I = sc.nextLine();
			String R = sc.nextLine();
			String[] strI = I.split(" ");
			String[] strR = R.split(" ");
			classifyData(strI, strR);
		}
	}

	private static void classifyData(String[] strI, String[] strR) {
		Set<Integer> setR = new TreeSet<>();
		for (int i = 1; i < strR.length; i++) {
			setR.add(Integer.parseInt(strR[i]));
		}
		List<Integer> res = new ArrayList<>();
		for (Integer r : setR) {
			List<Integer> temp = new ArrayList<>();
			for (int i = 1; i < strI.length; i++) {
				if (strI[i].contains("" + r)) {
					temp.add(i - 1);//序号
					temp.add(Integer.parseInt(strI[i]));//满足条件的数字
				}
			}
			if (!temp.isEmpty()) {
				res.add(r);
				res.add(temp.size() / 2);//几个满足条件
				res.addAll(temp);
			}
		}
		//最后输出结果
		System.out.print(res.size()+ " ");
		int count = res.size();
		for (Integer e : res) {
			if (count != 1)
				System.out.print(e + " ");
			else
				System.out.print(e);
			count--;
		}
		System.out.println();
	}

}
