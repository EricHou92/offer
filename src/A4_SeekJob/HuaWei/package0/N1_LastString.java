package A4_SeekJob.HuaWei.package0;

import java.util.Scanner;

public class N1_LastString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String string = scanner.nextLine();
			String[] all = string.split(" ");
			for(int i = 0; i< all.length; i++){
				if( i == all.length -1 )
					System.out.println(all[i].length());
			}
		}
	}
}
