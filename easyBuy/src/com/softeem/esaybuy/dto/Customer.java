package com.softeem.esaybuy.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * �ͻ�
 * @author MRChai
 *
 */
public class Customer implements Serializable{

	private int userid;			//ID
	private String username;	//�˺�
	private String password;	//����
	private String sex;			//�Ա�
	private Date birthday;		//����
	private String phone;		//�ֻ���
		
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}



	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
