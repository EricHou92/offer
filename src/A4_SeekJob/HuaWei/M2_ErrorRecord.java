package A4_SeekJob.HuaWei;

import java.util.*;
import java.util.Map.*;
public class M2_ErrorRecord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new LinkedHashMap<>();
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			if(s == null || s.equals(""))
				break;
			String name = s.split("\\s")[0];
			name = name.lastIndexOf('\\') != - 1 ? name.substring(name.lastIndexOf('\\') + 1) : name;
			String row = s.split("\\s")[1];
			map.put(name + " " + row, map.containsKey(name + " " + row) ? map.get(name + " " + row) + 1 : 1);
		}
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, (o1, o2) -> o2.getValue() - o1.getValue());
		for (int i = 0; i < 8; i ++) {
			Entry<String, Integer> entry = list.get(i);
			String key = entry.getKey().split("\\s")[0].length() > 16 ? entry.getKey().substring(entry.getKey().split("\\s")[0].length() - 16) : entry.getKey();
			System.out.println(key + " " + entry.getValue());
		}
	}
}

