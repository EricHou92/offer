package A4_SeekJob.HuaWei.package1;

import java.util.Scanner;

public class N20_PasswordTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String string = scanner.nextLine();
			if( checkLength(string) && checkCharKind(string) &&checkCharRepeat(string))
				System.out.println("OK");
			else
				System.out.println("NG");
		}
	}

	private static boolean checkLength(String string) {
		// TODO 自动生成的方法存根
		if(string == null || string.length() <= 8)
			return false;
		return true;
	}

	private static boolean checkCharKind(String string) {
		// TODO 自动生成的方法存根
		char[] ch = string.toCharArray();
		int upperCase = 0, lowerCase = 0, number = 0, other = 0;
		for(int i=0; i<ch.length; i++){
			if(ch[i] >= 'A' && ch[i] <= 'Z'){
				upperCase = 1;
				//continue;
			}
			else if(ch[i] >= 'a' && ch[i] <= 'z'){
				lowerCase = 1;
				//continue;
			}
			else if(ch[i] >= '0' && ch[i] <= '9'){
				number = 1;
				//continue;
			}
			else{
				other = 1;
				//continue;
			}
		}
		int count = upperCase + lowerCase + number + other;
		if(count >= 3)
			return true;
		return false;
	}

	private static boolean checkCharRepeat(String string) {
		// TODO 自动生成的方法存根
		for(int i=0; i<string.length()-2; i++){
			String string0 = string.substring(i, i+3);
			if(string.substring(i+1).contains(string0))
				return false;
		}
		return true;
	}
}
