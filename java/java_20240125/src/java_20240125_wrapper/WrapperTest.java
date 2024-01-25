package java_20240125_wrapper;

public class WrapperTest {
	public static void main(String[] args) {
		WrapperClass ex = new WrapperClass();
		System.out.println(ex.i);
		System.out.println(ex.l);
		System.out.println(ex.d);
		System.out.println(ex.f);
		System.out.println(ex.b);
		System.out.println(ex.i1);
		System.out.println(ex.l1);
		System.out.println(ex.d1);
		System.out.println(ex.f1);
		System.out.println(ex.b1);
		String str = "10";
		System.out.println(Long.parseLong(str));
		System.out.println(Double.parseDouble(str));
		System.out.println(Float.parseFloat(str));
		System.out.println(Boolean.parseBoolean(str));
		String result = Long.toString(10000000000L);
		       result = String.valueOf(10000000000L);
		       result = Float.toString(15.2F);
		       result = String.valueOf(15.2F);
		       result = Double.toString(15.2);
		       result = String.valueOf(15.2);
	}
}
