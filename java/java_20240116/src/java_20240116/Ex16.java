package java_20240116;

public class Ex16 {
	public static void main(String[] args) {
		// 100~90:A, 89~80:B, 79~70:C, 69~60 : D, 59이하 :F
		int score = 78;
		if (score >= 90) {
			System.out.println("A");
		} else { // 0~89
			if (score >= 80) {
				System.out.println("B");
			} else { // 0 ~ 79
				if (score >= 70) {
					System.out.println("C");
				} else {// 0 ~69
					if (score > 60) {
						System.out.println("D");
					} else { // 0 ~ 59
						System.out.println("F");
					}
				}
			}
		}

		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score > 60) {
			System.out.println("D");
		} else { // 0 ~ 59
			System.out.println("F");
		}

	}
}
