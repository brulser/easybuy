package com.softeem.easybuy.dao;

import java.util.List;

public interface IBaseDAO {

	/**
	 * ���
	 * @param obj	��Ҫ��ӵĶ���
	 * @return	��ӽ�� true:�ɹ���false:ʧ��
	 */
	public boolean save(Object obj);
	
	/**
	 * �޸�
	 * @param obj
	 * @return �޸Ľ�� true:�ɹ���false:ʧ��
	 */
	public boolean update(Object obj);
	
	/**
	 * ɾ��
	 * @param id	��Ҫ��ɾ����¼��id
	 * @return ɾ����� true:�ɹ���false:ʧ��
	 */
	public boolean delete(Object id);
	
	/**
	 * ����id��ѯ
	 * @param id	��Ҫ��ѯ�ļ�¼id
	 * @return ���ز�ѯ���Ķ���null��ʾ���󲻴���
	 */
	public Object findById(Object id);
	
	/**
	 * ��ѯ����
	 * @return	�������м�¼
	 */
	public List findAll();
	
	/**
	 * �������Բ�ѯ��������
	 * @param obj
	 * @return
	 */
	public Object findSingleObj(Object obj);
	
	/**
	 * �������Բ�ѯ��������
	 * @param obj
	 * @return
	 */
	public List findMultipleObj(Object obj);
	
}
