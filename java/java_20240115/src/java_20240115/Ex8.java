package java_20240115;

public class Ex8 {

	public static void main(String[] args) {
		int iNum = 20;
		float fNum = iNum; // 자동형변환
		System.out.println(iNum); // 20
		System.out.println(fNum); // 20.0
		double dNum = fNum + iNum;
		//            20.0 + 20
		//            20.0 + 20.0  // 20 => 20.0형변환
		//            4byte + 4byte = 4byte
		// 8byte = 4byte + 4byte :  자둉형변환
		byte b = 10; //     000000000001010 
		short sh = 128; //  000000010000000
		//              +   000000010001010
		
	}
}
