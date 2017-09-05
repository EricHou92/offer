package A4_SeekJob.HuaWei.package2;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class N33_DeleteMin {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext()){
			String string=scanner.nextLine();
			char[] ch=string.toCharArray();
			Map<Character,Integer> m= new LinkedHashMap<>();
			for(char c:ch){
				if(!m.containsKey(c)){
					m.put(c,1);
				}else{
					m.put(c,m.get(c)+1);
				}     
			}
			Collection<Integer> al=m.values();
			int index=Collections.min(al);
			StringBuffer stringBuffer=new StringBuffer("");
			for(char c:ch){
				if(m.get(c)!=index)
					stringBuffer.append(c);
			}
			System.out.println(stringBuffer.toString());
		}
	}
}