package java_20240118;

public class GoodsEx {
	public static void main(String[] args) {
		Goods gd = new Goods("123", "내장고", 1000, "싸요.");
		//System.out.println(gd.goodsPrice);
		System.out.println(gd.getGoodsPrice());
		
		Goods gd1 = new Goods();
		//gd.goodsNum = "11231";
		gd1.setGoodsNum("11231");
		System.out.println(gd1.getGoodsNum());
		
	}
}
