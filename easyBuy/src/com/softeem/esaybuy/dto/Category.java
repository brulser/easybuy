package com.softeem.esaybuy.dto;

import java.io.Serializable;

/**
 * ��Ʒ����
 * @author MRChai
 *
 */
public class Category implements Serializable {

	private int cid;		//ID
	private String cname;	//������
	private String summary;	//����
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
}
