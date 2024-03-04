package model.dto;

import java.util.Date;

public class GoodsDTO {
	String goodsNum;
	String goodsName;
	int goodsPrice;
	String goodsContent;
	int deliveryCost;
	
	String empNum;
	
	int visitCount;
	Date goodsRegist;
	String updateEmpNum;
	Date goodsUpdateDate;
	public int getVisitCount() {
		return visitCount;
	}
	public void setVisitCount(int visitCount) {
		this.visitCount = visitCount;
	}
	public Date getGoodsRegist() {
		return goodsRegist;
	}
	public void setGoodsRegist(Date goodsRegist) {
		this.goodsRegist = goodsRegist;
	}
	public String getUpdateEmpNum() {
		return updateEmpNum;
	}
	public void setUpdateEmpNum(String updateEmpNum) {
		this.updateEmpNum = updateEmpNum;
	}
	public Date getGoodsUpdateDate() {
		return goodsUpdateDate;
	}
	public void setGoodsUpdateDate(Date goodsUpdateDate) {
		this.goodsUpdateDate = goodsUpdateDate;
	}
	public String getEmpNum() {
		return empNum;
	}
	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}
	
	public String getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getGoodsContent() {
		return goodsContent;
	}
	public void setGoodsContent(String goodsContent) {
		this.goodsContent = goodsContent;
	}
	public int getDeliveryCost() {
		return deliveryCost;
	}
	public void setDeliveryCost(int deliveryCost) {
		this.deliveryCost = deliveryCost;
	}
}
