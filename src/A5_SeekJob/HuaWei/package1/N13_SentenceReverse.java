package A5_SeekJob.HuaWei.package1;

import java.util.Scanner;

public class N13_SentenceReverse {

	public static void main(String[] args){
		Scanner	scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String number = scanner.nextLine();
			senReverse(number);
		}
	}

	private static void senReverse(String number) {
		String[] numbers = number.split(" ");
		for(int i=numbers.length-1; i>=0; i--){
			System.out.print(numbers[i] + " ");		
		}
	}

}
