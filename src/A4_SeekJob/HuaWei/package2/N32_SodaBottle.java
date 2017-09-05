package A4_SeekJob.HuaWei.package2;

import java.util.Scanner;

public class N32_SodaBottle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int num = scanner.nextInt();
			if(num == 0 || num < 1 || num > 100)
				break;
			int m = num / 3;
			int n = num % 3;
			int count = m;
			while(m > 0){
				int temp1 = m;
				int temp2 = n;
				m = (temp1 + temp2) / 3;
				n = (temp1 + temp2) % 3;
				count +=m;
			}
			if(m == 0 && n == 2)
				count++;
			System.out.println(count);
		}
	}
}
