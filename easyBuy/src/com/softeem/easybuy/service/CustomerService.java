package com.softeem.easybuy.service;

import com.softeem.easybuy.dao.ICustomerDAO;
import com.softeem.easybuy.dao.impl.CustomerDAO;
import com.softeem.esaybuy.dto.Customer;

public class CustomerService {

	private ICustomerDAO dao = new CustomerDAO();
	
	public CustomerService() {
	}
	
	public ServiceModel login(Customer user){
		ServiceModel model = new ServiceModel();
		Object obj = dao.findSingleObj(user);
		if(obj != null){
			Customer c = (Customer)obj;
			if(c.getPassword().equals(user.getPassword())){
				model.setCode(1);
				model.setData(c);
				model.setMessage("��¼�ɹ�");
			}else{
				model.setCode(0);
				model.setMessage("�������");
			}
		}else{
			model.setCode(-1);
			model.setMessage("�˺Ų�����");
		}
		return model;
	}
	
	public ServiceModel register(Customer user){
		ServiceModel model = new ServiceModel();
		Object obj = dao.findSingleObj(user);
		if(obj == null){
			if(dao.save(user)){
				model.setCode(1);//ok
				model.setMessage("ע��ɹ�");
			}else{
				model.setCode(0);//�쳣
				model.setMessage("ע��ʧ��");
			}
		}else{
			model.setCode(-1);//�˺���ע��
			model.setMessage("�˺��ѱ�ע��");
		}
		return model;
	}
}
