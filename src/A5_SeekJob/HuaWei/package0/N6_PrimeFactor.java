package A5_SeekJob.HuaWei.package0;

import java.util.Scanner;

public class N6_PrimeFactor {
	 private static void isPrimeFactor(long number)
	    {
	        while(number != 1)
	        {
	            for(int i = 2; i <= number ;i++)
	            {
	                if(number % i == 0)
	                {
	                    number /= i;
	                    System.out.print(i + " ");
	                    break;
	                }
	            }
	        }
	    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			long num = scanner.nextLong();
			isPrimeFactor(num);
		}
	}
	
}
