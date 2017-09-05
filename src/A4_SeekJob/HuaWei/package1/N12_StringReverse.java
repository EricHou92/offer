package A4_SeekJob.HuaWei.package1;
import java.util.Scanner;

public class N12_StringReverse {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String number = scanner.nextLine();
			StringBuffer sb = new StringBuffer(number);
			String out = sb.reverse().toString();
			System.out.println(out);
		}
	}
}
