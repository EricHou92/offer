package A5_SeekJob.HuaWei.package2;

import java.util.Scanner;

public class N36_StringSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String string = scanner.nextLine();
			char[] strings = string.toCharArray();
			StringBuilder stringBuilder = new StringBuilder();
			for(int i=0; i<26; i++){
				char ch = (char) (i+'A');
				for(int j=0; j<strings.length; j++){
					if(strings[j] == ch || strings[j] == ch +32)
						stringBuilder.append(strings[j]);
				}
			}
			for(int i=0; i<strings.length; i++){
				if(!(strings[i]>='a' && strings[i]<='z' || strings[i]>='A' && strings[i]<='Z'))
					stringBuilder.insert(i, strings[i]);
			}
			System.out.println(stringBuilder.toString());
		}
	}
}
