package com.softeem.esaybuy.dto;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * ����
 * @author MRChai
 *
 */
public class Orders implements Serializable{

	private int id;				//ID
	private String orderNo;		//������
	private int orderCount;		//��������
	private Timestamp orderTime;//��������ʱ��
	private Customer customer;	//����ͻ�
	private Goods goods;		//��������Ʒ
	private int status;			//����״̬
	private double totalPrice;	//�ܼ�
	private Address addr;		//�ջ���ַ
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public int getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
	public Timestamp getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
}
