package A5_SeekJob.HuaWei.package0;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class N9_RemoveDuplicate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String string = scanner.nextLine();
			char[] strings = string.toCharArray();
			HashSet<Character> hashSet = new LinkedHashSet<>();
			//使用链表维护元素的次序，必须使用LinkedHashSet
			for(int i=strings.length-1; i>=0; i--)
				hashSet.add(strings[i]);
			for(Character c : hashSet)
				System.out.print(c);
		}
	}
}
