package string;

public class StringTest {
	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		double d = 10.5;
		double d1 = 10.5;
		int i1 [] = new int[4];  // i1 : 객체변수, 주소변수
		i1[0] = 15;
		if (i == j) System.out.println("같다");
		
		String str1 = "오연의"; // 
		String str2 = "오연의";
		if (str1 == str2) System.out.println("같다"); // X
		String str3 = new String("오연의");
		if (str1 == str3) System.out.println("같다"); // X
		else System.out.println("다르다.");
		// calc :객체변수, 주소변수
		Calculator calc = new Calculator(10, 20);//calc : 객체변수 :4byte
		calc.first = 10; //first:멤버변수, 인스턴스변수, 멤버필드
		Calculator calc1 = new Calculator(10, 20);
		calc1.first = 100;
		
		
		if (str1.equals(str3)) System.out.println("같다"); // O
		
		int ii = 10;
		int ii2 = 10;
		if(ii == ii2)System.out.println("같다");
		String str11 = "이숭무";
		String str12 = new String("이숭무");
		if(str11.equals(str12))System.out.println("같다");
		// 
	}
}
