package A5_SeekJob.HuaWei.package2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class N37_BrotherWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int num = scanner.nextInt();
			String[] s = new String[num];
			int count = 0;
			List<String> arrayList = new ArrayList<>();
			for(int i=0; i<num; i++)
				s[i] = scanner.next();
			String select = scanner.next();
			char[] selects = select.toCharArray();
			Arrays.sort(selects);
			int no =scanner.nextInt();
			for(int i=0; i<num; i++){
				int c = check(select,s[i]);
				count += c;
				if(c == 1)
					arrayList.add(s[i]);
			}
			System.out.println(count);
			Collections.sort(arrayList);
			if(count >= no)
				System.out.println(arrayList.get(no-1));
		}
	}

	private static int check(String select, String string) {
		// TODO 自动生成的方法存根
		if(select.length()!= string.length() || string.equals(select))
			return 0;
		char[] selects = select.toCharArray();
		Arrays.sort(selects);
		char[] strings = string.toCharArray();
		Arrays.sort(strings);
		return Arrays.equals(selects, strings)?1:0;
	}


}
