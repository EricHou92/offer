package A5_SeekJob.HuaWei.package0;

import java.util.Scanner;

public class N5_HexChange {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String string = scanner.nextLine();
			if(string.startsWith("0x")){
				int decimal = Integer.parseInt(string.substring(2), 16);
				//int decimal = Integer.valueOf(string.substring(2), 16);
				System.out.println(decimal);
			}
		}
		
	}
}
