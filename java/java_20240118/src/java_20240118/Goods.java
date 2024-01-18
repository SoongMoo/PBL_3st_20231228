package java_20240118;

public class Goods {
	private String goodsNum;
	private String goodsName;
	private int goodsPrice;
	private String goodsContent; 
	public Goods(){} // 기본생성자
	public Goods(String goodsNum, String goodsName, int goodsPrice,
			String goodsContent){
		this.goodsNum = goodsNum;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.goodsContent = goodsContent;
	}
	/// setter : 값을 저장
	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public void setGoodsContent(String goodsContent) {
		this.goodsContent = goodsContent;
	}
	/// getter : 값을 보내주는 것을
	public String getGoodsNum() {
		return goodsNum;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public int getGoodsPrice() {
		return goodsPrice;
	}
	public String getGoodsContent() {
		return goodsContent;
	}
	
}
