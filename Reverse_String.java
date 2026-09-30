
public class Reverse_String {
	public static void main(String[] args) {
		String str = "abcdefgh1234ijk56lmn";
		
		char[] s = str.toCharArray();
		
		int charCount = 0;
		for(char ch : s) {
			if((ch >= 'a' && ch<='z') || (ch>='A' && ch<='Z')) {
				charCount++;
			}
		}
		
		int index = 0;
		char[] letters = new char[charCount];
		for(int i=0; i<s.length; i++) {
			if((s[i]>= 'a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z')) {
				letters[index++] = s[i];
			}	
		}
		
		index = letters.length-1;
		for(int i=0; i<s.length; i++) {
			if((s[i]>= 'a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z')) {
				s[i] = letters[index--];
			}
		}
		
        System.out.println("Reversed letters only (digits same place): " + new String(s));
		
	}
}
