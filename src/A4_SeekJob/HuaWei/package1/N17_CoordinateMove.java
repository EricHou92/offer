package A4_SeekJob.HuaWei.package1;

import java.util.Scanner;

public class N17_CoordinateMove {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x=0, y=0;
		while (scanner.hasNext()) {
			String string = scanner.nextLine();
			String[] strings = string.split(";");
			for(int i=0; i<strings.length; i++){
				//System.out.println(strings[i]);
				if(strings[i].length() > 0){
					if(strings[i].charAt(0) == 'A' && strings[i].substring(1).matches("^\\d{0,2}$"))
						x -= Integer.parseInt(strings[i].substring(1));
					if(strings[i].charAt(0) == 'D' && strings[i].substring(1).matches("^\\d{0,2}$"))
						x += Integer.parseInt(strings[i].substring(1));
					if(strings[i].charAt(0) == 'W' && strings[i].substring(1).matches("^\\d{0,2}$"))
						y += Integer.parseInt(strings[i].substring(1));
					if(strings[i].charAt(0) == 'S' && strings[i].substring(1).matches("^\\d{0,2}$"))
						y -=Integer.parseInt(strings[i].substring(1));
				}
			}
			System.out.println(x + "," + y);
		}
	}

}
