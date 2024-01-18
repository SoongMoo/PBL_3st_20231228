package java_20240118;

public class LoopEx1 {
	public static void main(String[] args) {
		int num = 0;
		for(int i = 10 ; i <= 20 ; i+=2) {
			num+=i;
		}
		System.out.println(num);
		num = 0;
		for(int i = 20 ; i >= 10; i-=2) {
			num+=i;
		}
		System.out.println(num);
		for(int i = 1; i <= 9; i++) {
			if (i % 2 != 0)
				System.out.println("6 * " + i + " = " + 6 * i);
		}
		for(int i = 1; i<= 9; i+=2) {
			System.out.println("6 * " + i + " = " + 6 * i);
		}
		int gop = 1;
		for(int i = 1 ; i <= 9 ; i++) {
			if(gop % 2 != 0)
				System.out.println("7 * " + gop + " = " + 7 * gop);
			gop++;
		}
		for(int i = 1; i <= 9; i++) {
			if(i % 2 == 0) continue;
			
			System.out.println("6 * " + i + " = " + 6 * i);
		}
		int rnd = (int)(Math.random() * 9) + 1;
		for(int i = 1; i <= rnd; i++) {
			System.out.println("8 * " + i + " = " + 8 * i);
		}
		int x = 1;
	    int z = 10;
	    int g = 4;
	    for(int i = x; i <= z; i+=g) {
	    	System.out.println("실행");
	    }
	    for(int dan = 6; dan <= 7; dan++) {
	    	System.out.println(dan+"단 시작");
	    	for(gop = 4; gop <= 6; gop++) {
	    		System.out.println(dan + " * " + gop + " = " + dan * gop);
	    	}
	    	System.out.println(dan+"단 끝");
	    }
	    
	    for(int dan = 6; dan <= 7; dan++) {
	    	System.out.println(dan+"단 시작");
	    	for(gop = 4; gop <= 6; gop++) {
	    		System.out.print(dan + " * " + gop + " = " + dan * gop);
	    		System.out.print("\t");
	    	}
	    	System.out.println();
	    	System.out.println(dan+"단 끝");
	    }
	    System.out.println("<table border=1>");
	    for(int i = 1; i <= 4 ; i++) {
	    	System.out.print("<tr>");
	    	for(int j = 1; j <= 4 ; j++ ) {
	    		System.out.print("<td>" + j + "</td>");
	    	}
	    	System.out.println("</tr>");
	    }
	    System.out.println("</table>");
	    for(int i = 1; i <= 5 ; i++) {
	    	for(int j = 1; j <= 6; j++) {
	    		 int rnd1 = (int)(Math.random() * 45)+1;
	    		 System.out.print(rnd1 + ", ");
	    	}
	    	System.out.println();
	    }
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
	}
}
