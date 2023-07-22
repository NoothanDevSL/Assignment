package Questions;

public class Vowels {

	public static void main(String[] args) {
		String s = "Hello Good Morning";
		System.out.println("given sentense is " + s);
		int count =0,count1 =0,count2=0;
		for(int i = 0;i<s.length();i++) {
			char ch = s.charAt(i);
			if((ch=='a') || (ch=='e') || (ch=='i')||(ch=='o') || (ch=='u')) {
				count ++;
			}else {
				if(ch ==' ') {
					count1++;
					
				}
				else {
					count2++;
				}
					
			}
		}
		System.out.println("number of vowels are " +count);
		System.out.println("number of spaces are " +count1);
		System.out.println("number of consonents are " + count2);

	}

}
