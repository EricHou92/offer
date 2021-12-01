package A1_JianzhiOffer.T2_String;

public class N2_ReplaceBlank {

	//请实现一个函数，将一个字符串中的空格替换成“%20”.
	public String replaceSpace(StringBuffer str) {
		// 从后往前，先计算需要多少空间，然后从后往前移动，则每个字符只为移动一次，这样效率更高一点
		// 时间复杂度：O(n) 空间复杂度：O(1)
		int spaceNum = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' ')
				spaceNum++;
		}
		int indexOld = str.length()-1;
		int newLength = str.length() + spaceNum*2;
		int indexNew = newLength-1;
		str.setLength(newLength);
		for(;indexOld>=0 && indexOld<newLength;--indexOld){
			if(str.charAt(indexOld) == ' '){
				str.setCharAt(indexNew--, '0');
				str.setCharAt(indexNew--, '2');
				str.setCharAt(indexNew--, '%');
			}else{
				str.setCharAt(indexNew--, str.charAt(indexOld));
			}
		}
		return str.toString();
	}
}
