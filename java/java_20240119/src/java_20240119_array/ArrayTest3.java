package java_20240119_array;

public class ArrayTest3 {
	public static void main(String[] args) {
		String [] str = new String[5]; // \0
		str[0] = "이숭무";
		str[1] = "이상범";
		str[2] = "이장범";
		for(String s : str) {
			System.out.println(s);
		}
		
		char [] ch = new char[26]; // A ~ Z
		ch[0] = 0+ 65;
		ch[1] = 1 + 65;
		//...
		ch[25] = 25  + 65;
		//System.out.println((char)90);
		for (int i = 0 ; i < ch.length ; i++) {
			ch[i] = (char)(i + 65);
		}
		char [] ch1 = new char[26];
		char character = 'A';
		for(int i = 0; i < ch1.length; i++, character++ ) {
			ch1[i] = character;
		}
		for(char c : ch1) {
			System.out.println(c);
		}
	}
}