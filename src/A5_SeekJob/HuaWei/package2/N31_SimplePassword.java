package A5_SeekJob.HuaWei.package2;

import java.util.Scanner;

public class N31_SimplePassword {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String string = scanner.next();
			char[] ch = string.toCharArray();
			for(int i=0; i<ch.length; i++){
				if(ch[i] >= 'a' && ch[i] <= 'c')
					ch[i] = '2';
				if(ch[i] >= 'd' && ch[i] <= 'f')
					ch[i] = '3';
				if(ch[i] >= 'g' && ch[i] <= 'i')
					ch[i] = '4';
				if(ch[i] >= 'j' && ch[i] <= 'l')
					ch[i] = '5';
				if(ch[i] >= 'm' && ch[i] <= 'o')
					ch[i] = '6';
				if(ch[i] >= 'p' && ch[i] <= 's')
					ch[i] = '7';
				if(ch[i] >= 't' && ch[i] <= 'v')
					ch[i] = '8';
				if(ch[i] >= 'w' && ch[i] <= 'z')
					ch[i] = '9';
				if(ch[i] >= 'A' && ch[i] <= 'Z')
					ch[i] = (char) ((ch[i] + 33 - 'a')%26 + 'a');
				System.out.print(ch[i]);
			}
		}
	}
}
