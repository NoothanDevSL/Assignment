package Questions;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
	public static void main(String[] args) {
		
		String s="Noothan";
		char a[] = s.toCharArray();
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		for (char i:a) {
			Integer  occ=map.get(i);
			if(occ==null) {
				map.put(i, 1);
			}
			else {
				map.put(i, ++occ);
			}
			
			
		}
		System.out.println(a);
		
	}

}
