package A4_SeekJob.HuaWei.package1;

import java.util.Scanner;

public class N15_CountOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			Integer num = scanner.nextInt();
			int count = 0;
			if(num > 0){
				String string = Integer.toBinaryString(num);
				for(int i=0; i<string.length(); i++){
					if(string.charAt(i) == '1'){
						count++;
					}
				}
				System.out.println(count);
			}
		}
	}
}
