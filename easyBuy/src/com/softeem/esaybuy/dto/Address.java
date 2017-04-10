package com.softeem.esaybuy.dto;

import java.io.Serializable;

/**
 * dto�����ݴ������
 * dao:���ݷ��ʶ���
 * ORM:����(java����)��ϵ(��ϵ�����ݿ�)ӳ��
 * ��ϵ�����ݿ��е�һ����¼��Ӧһ��java���еĶ���
 * �ջ���ַ
 * @author MRChai
 *
 */
public class Address implements Serializable {

	private int addrid;			//ID
	private String province;	//ʡ
	private String city;		//��
	private String area;		//��
	private String street;		//��ϸ�ֵ�
	private String receiveUser;	//�ջ���
	private String phone;		//�ջ����ֻ���
	private Customer user;		//��ַ�����û�
	
	public int getAddrid() {
		return addrid;
	}
	public void setAddrid(int addrid) {
		this.addrid = addrid;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getReceiveUser() {
		return receiveUser;
	}
	public void setReceiveUser(String receiveUser) {
		this.receiveUser = receiveUser;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Customer getUser() {
		return user;
	}
	public void setUser(Customer user) {
		this.user = user;
	}
}
