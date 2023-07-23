package Questions;

import java.util.HashMap;
import java.util.Map;

public class Occurrancy {

	public static void main(String[] args) {
		String s="noothan";
        char a[]=s.toCharArray();
                Map<Character, Integer> map=new HashMap<Character, Integer>();
        for(char i:a) {
            Integer count=map.get(i);
            if(count==null) {
                map.put(i,1);
            }
            else {
                map.put(i,count+1);
            }
        }

        System.out.println(map);


	}

}
