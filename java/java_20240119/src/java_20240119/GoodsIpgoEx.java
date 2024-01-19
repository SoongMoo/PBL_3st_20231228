package java_20240119;

public class GoodsIpgoEx {
	public static void main(String[] args) {
		GoodsIpgo goodsIpgo = new GoodsIpgo();
		Goods goods = new Goods();
		goods.setGoodsNum("hk00001");
		goods.setGoodsName("내장고");
		goodsIpgo.setGoods(goods);
		goodsIpgo.setIpgoPrice(1000);
		goodsIpgo.setIpgoQty(10);
				
		System.out.println(goodsIpgo.getGoods().getGoodsName());
		System.out.println(goodsIpgo.getGoods().getGoodsNum());
		System.out.println(goodsIpgo.getIpgoPrice());
		System.out.println(goodsIpgo.getIpgoQty());
		
		GoodsIpgo goodsIpgo1 = new GoodsIpgo();
		goodsIpgo1.setGoods(new Goods());
		goodsIpgo1.getGoods().setGoodsNum("1234"); 
					 // goods.setGoodsName("fgs")
		goodsIpgo1.getGoods().setGoodsName("청바지");
		goodsIpgo1.setIpgoPrice(1000);
		goodsIpgo1.setIpgoQty(50);
		System.out.println(goodsIpgo1.getGoods().getGoodsNum());
		System.out.println(goodsIpgo1.getGoods().getGoodsName());
		System.out.println(goodsIpgo1.getIpgoPrice());
		System.out.println(goodsIpgo1.getIpgoQty());
		
		Goods gd = goodsIpgo1.getGoods();
		System.out.println(gd.getGoodsNum());
		System.out.println(gd.getGoodsName());
		
			
	}
}
