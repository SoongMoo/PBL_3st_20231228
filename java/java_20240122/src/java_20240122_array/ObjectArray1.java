package java_20240122_array;

public class ObjectArray1 {
	public static void main(String[] args) {
		char [] ch1 = new char [26];
		char ch = 'A';  // 65, 66, 67,68
		// 65 + 0 : A
		// 65 + 1 : B
		// 65 + 2 : C
		//...
		// 65 + 25 : Z
		//ch1에 A부터 Z까지 저장 : 알고리즘
		for(int i = 0; i < 26; i++ ) { // 로직
			ch1[i] = (char)(ch + i);  // char + int = int + int = int ===> (char)int
		}
		for(char z : ch1) {
			System.out.println(z);
		}
		for(int i = 0; i < 26; i++) {
			ch1[i] = ch ++;
		}
		for(char z : ch1) {
			System.out.println(z);
		}
		ch ='A';
		for(int i = 0; i < 26; i++) {
			ch1[i] = ch;
			ch++;
		}
		ch ='A';
		for(int i = 0; i < 26; i++, ch++) {
			ch1[i] = ch;
		}
		for(char z : ch1) {
			System.out.println(z);
		}
	}
}
