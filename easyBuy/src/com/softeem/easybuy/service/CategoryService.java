package com.softeem.easybuy.service;

import java.util.List;

import javax.xml.registry.infomodel.User;

import com.softeem.easybuy.dao.ICategoryDAO;
import com.softeem.easybuy.dao.impl.CategoryDAO;
import com.softeem.esaybuy.dto.Category;

public class CategoryService {

	private ICategoryDAO  dao = new CategoryDAO();//��̬
	
	/**
	 * ��ѯ���з���
	 * @return
	 */
	public List<Category> searAll(){
		return dao.findAll();
	}
	
//	public ServiceModel login(User user){
//		User u1 = dao.find(user);
//		if(u1 != null){
//			//yonghucunzai
//			if(u1.getPass().equals(user.getPass())){
//				//�ɹ�
//			}else{
//				//mima cuowu
//			}
//		}else{
//			//�˺Ų���ȷ
//		}
//		//{"state":"1","msg":"�ɹ�","obj":{"uneme":"asdmin","pass":"sdf"....}}
//	}
}
