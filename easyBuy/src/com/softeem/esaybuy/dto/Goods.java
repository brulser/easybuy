package com.softeem.esaybuy.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * ��Ʒ
 * JavaBean
 * @author MRChai
 *
 */
public class Goods implements Serializable{

	private int gid; // id
	private String gname; // ��Ʒ��
	private double price; // �۸�
	private double offset; // �ۿ�
	private Date publishTime; // �ϼ�ʱ��
	private int total; // ʣ������
	private Category category; // ��������
	private List<GoodsImgs> goodsImgs; // ��Ʒ��ͼ����

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getOffset() {
		return offset;
	}

	public void setOffset(double offset) {
		this.offset = offset;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<GoodsImgs> getGoodsImgs() {
		return goodsImgs;
	}

	public void setGoodsImgs(List<GoodsImgs> goodsImgs) {
		this.goodsImgs = goodsImgs;
	}

	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", price=" + price
				+ ", offset=" + offset + ", publishTime=" + publishTime
				+ ", total=" + total + ", category=" + category
				+ ", goodsImgs=" + goodsImgs + "]";
	}

}
