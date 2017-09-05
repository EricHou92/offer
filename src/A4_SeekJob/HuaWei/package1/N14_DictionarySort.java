package A4_SeekJob.HuaWei.package1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class N14_DictionarySort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> linkedList = new LinkedList<>();
		while (scanner.hasNext()) {
			int num = scanner.nextInt();
			if(num >=1 && num <=1000){
				for(int i=0; i<=num; i++){
					String string = scanner.nextLine();
					//正则表达式限定
					Pattern pattern = Pattern.compile("^[A-Za-z]+$"); 
					Matcher matcher = pattern.matcher(string);
					if(matcher.matches()){
						if(string.length() <= 100)
							linkedList.add(string);
						}
					}
				}
			Collections.sort(linkedList);
			for(String s : linkedList)
				System.out.println(s);
			}
		}
	}
