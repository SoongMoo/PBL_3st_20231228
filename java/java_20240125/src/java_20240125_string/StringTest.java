package java_20240125_string;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "오연의"; // 상수풀 영역
		String str2 = "오연의";
		if(str1 == str2)
			System.out.println("안된다");
		if(str1.equals(str2))
			System.out.println("같다");
		String str3 = new String("오연의"); // heap영역
		if(str1 == str3)
			System.out.println("안된다.");
		if(str1.equals(str3))
			System.out.println("같다");
		
		String javaStr = new String("java");
		String androidStr = new String("android");
		str3 = javaStr.concat(androidStr);
		System.out.println(str3);
		str3 = javaStr + androidStr; // 연결연산자
		System.out.println(str3);
		/// 값이 저장되어 있는 메모리 주소
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(javaStr)); 
		System.out.println(System.identityHashCode(androidStr));
		System.out.println(System.identityHashCode(str1)); 
		System.out.println(System.identityHashCode(str2));
		String subject = "자바 프로그래밍";
		///               0 1 2 3 4 5 6 7  //가상의 index
		char ch = subject.charAt(3);
		System.out.println(ch);
		String result =  subject.substring(3, 3+5);
		System.out.println(result);
		result = subject.substring(3, 3+3); // start=3, stop=6
		System.out.println(result);	
		result = subject.substring(3, 5 + 1);
		System.out.println(result);
		int idx = subject.indexOf('프');
		System.out.println(idx);
		result = subject.substring(idx, idx + 3);
		System.out.println(result);
		result = subject.substring(subject.indexOf('프'), subject.indexOf('프') + 3);
		System.out.println(result);
		idx = subject.indexOf("프로그");
		System.out.println(idx); //첫번째 글자의 index
		/// 문제 :  subject에서 "로그래밍"을 출력하세요.
		result = subject.substring(4, 4+ 4);
		System.out.println(result);
		idx = subject.indexOf('로');
		result = subject.substring(idx, idx + 4);
		System.out.println(result);
		result = subject.substring(4); 
		System.out.println(result);                                       //size()
		int len = subject.length(); // 문자열의 크기, length: 상수:배열 , length() 객체 : 메서드
		System.out.println(len);
		result = subject.substring(4, len);
		System.out.println(result);
		result = subject.substring(4, subject.length());
		System.out.println(result);
		int i[] = {1,2,3,4,5};
		for (int y = 0; y < i.length ;y++) {
			System.out.println(i[y]);
		}
		//자바를 java로변경
		String newStr = subject.replace("자바", "java");
		System.out.println(subject);
		System.out.println(newStr);
		// 대소문자변경
		String original = "Java Programming";
		String lowerCase = original.toLowerCase(); //모두소문자
		System.out.println(lowerCase);
		String upperCase = original.toUpperCase(); // 모두 대문자
		System.out.println(upperCase);
		
		String oldStr = "   Java Programming   ";
		if(oldStr.equals("Java Programming")) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		String newStr1 = oldStr.trim(); //양옆에 있는 공백문자를 지울때 사용
		if(newStr1.equals("Java Programming")) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		int ii = 10;
		System.out.println(ii);
		String result1 = String.valueOf(ii); // 정수,실수,문자,부울타입을 문자열로
		System.out.println(result1);
		double dd = 10.5;
		result1 = String.valueOf(dd);
		System.out.println(result1);
	}
}
