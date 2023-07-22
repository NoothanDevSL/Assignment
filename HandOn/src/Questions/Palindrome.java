package Questions;

public class Palindrome {

	public static void main(String[] args) {
		String s="Noothan";
		String a="";
		for(int i=s.length()-1;i>=0;i--) {
			a+=s.charAt(i);
			
		}
		
		if(s.equals(a)) {
			System.out.println("palindrome"+a);
		}
		else {
			System.out.println("not palindrome"+a);
		

	}

	}
}