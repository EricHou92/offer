package A5_SeekJob.HuaWei.package0;

import java.util.Scanner;

public class N7_Approximate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextFloat()) {
			float num = scanner.nextFloat();
			if(num > 0){
				int out = Math.round(num);
				System.out.println(out);
			}
		}
	}
}
