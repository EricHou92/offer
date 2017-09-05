package A4_SeekJob.HuaWei.package0;

import java.util.Scanner;

public class N4_SplitString {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String string = scanner.nextLine();
			if((string.length()%8)!=0)
				string = string + "00000000";
			while(string.length() >= 8){
				String out = string.substring(0, 8);
				System.out.println(out);
				string = string.substring(8);
			}
		}
	}
}
