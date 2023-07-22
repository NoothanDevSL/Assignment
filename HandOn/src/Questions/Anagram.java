package Questions;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String stt1= "Java";
		String stt2 = "ajav";
		stt1=stt1.toLowerCase();
		stt2 = stt2.toLowerCase();
		
		if(stt1.length() ==stt2.length()) {
			char[] char1 = stt1.toCharArray();
			char[] char2 = stt2.toCharArray();
			
			Arrays.sort(char1);
			Arrays.sort(char2);
			boolean resule = Arrays.equals(char1, char2);
			if(resule) {
				System.out.println("it is an anagram");
			}else {
				System.out.println("not an anagrams");
			}
		}else {
			System.out.println("not an anagrams");
		}
		

	}

}
