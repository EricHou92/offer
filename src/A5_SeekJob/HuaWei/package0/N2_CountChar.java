package A5_SeekJob.HuaWei.package0;

import java.util.Scanner;

public class N2_CountChar {
	public static void main(String args[]) {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String all = scanner.nextLine();
			char[] ac = all.toCharArray();
			String one = scanner.nextLine();
			for(int i =0; i < ac.length; i++){
				if(one.equalsIgnoreCase(String.valueOf(ac[i])))
					num++ ;
			}
			System.out.println(num);
		}
	}
}
