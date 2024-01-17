package java_20240115;

public class Ex7 {
	public static void main(String[] args) {
		// 형변환
		byte b = 10;
		short s = 10;
		s = b; // 1byte => 2byte :자동 형변환
		// byte => short => int => long
		int i = b;
		i = s;
		long l = b;
		l = s;
		l = i;
		// 정수는 실수가 될 수 있다.
		int i1 = 100;
		float f = i1; // 4byte ==> 4byte : 정수 => 실수
		double d = i1; // 4byte ==> 8byte 
		d = f;
		// =============================================>
		//      -32768 ~ 32767
		// byte => short => int => long => float => double
		          //char => 
		///        65535
		//<=============================================
		// 0101010101010101 : short
		//         01010101 : byte  
		// 0000000001010101 : short
		//         01010101 : byte
		int i3 = 21474868;
		short s1 = (short)i3; // 강제 형변환
		s = (short)l;
		i1 = (int)f; // 실수를 정수로 변환: 강제 형변환\
		double dNum = 3.14;
		i1 = (int)dNum; // 실수를 정수로 형변환
		System.out.println(i1);		
	}
}
