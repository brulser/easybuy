package com.softeem.esaybuy.dto;

import java.io.Serializable;

/**
 * ����Ա
 * admin 123456
 * @author MRChai
 *
 */
public class Admin implements Serializable {

	private int aid; 			// ID
	private String username;	// �˺�
	private String password;	// ����
	private String phone;		// �绰
	private int power;			// Ȩ�ޣ�Ԥ���� Ĭ��Ϊ:1  Ϊ0ʱ����ɾ��(�߼�)

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", username=" + username + ", password="
				+ password + ", phone=" + phone + ", power=" + power + "]";
	}
}
