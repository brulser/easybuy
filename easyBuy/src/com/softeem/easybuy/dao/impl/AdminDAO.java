package com.softeem.easybuy.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.softeem.easybuy.dao.IAdminDAO;
import com.softeem.easybuy.dbhelper.CallBack;
import com.softeem.easybuy.dbhelper.DAOHelper;
import com.softeem.easybuy.dbhelper.DBUtils;
import com.softeem.esaybuy.dto.Admin;

public class AdminDAO implements IAdminDAO {

	private Connection conn;
	
	public AdminDAO() {
		conn = DBUtils.getConn();
	}
	//��ӹ���Ա
	public boolean save(Object obj) {
		String sql = "insert into eb_admin(username,password,phone) values(?,?,?)";
		Admin admin = (Admin)obj;
		return DAOHelper.executeUpdate(conn, sql, 
				admin.getUsername(),
				admin.getPassword(),
				admin.getPhone());
	}
	//����id�޸Ĺ���Ա����
	public boolean update(Object obj) {
		String sql = "update eb_admin set password=? where aid=?";
		Admin admin = (Admin)obj;
		return DAOHelper.executeUpdate(conn, sql, admin.getPassword(),admin.getAid());
	}

	//�߼�ɾ�� ����:����id
	public boolean delete(Object id) {
		String sql = "update eb_admin set power=0 where aid=?";
		return DAOHelper.executeUpdate(conn, sql, id);
	}
	//����id��ѯ����Ա������Ϊnull����id����
	public Object findById(Object id) {
		String sql = "select aid,username,password,phone,power from eb_admin where aid=? and power!=0";
		return DAOHelper.executeQuery(sql, new CallBack() {
			public List getResults(ResultSet rs) {
				List list = new ArrayList();
				try {
					if(rs.next()){
						Admin admin = new Admin();
						admin.setAid(rs.getInt(1));
						admin.setUsername(rs.getString(2));
						admin.setPassword(rs.getString(3));
						admin.setPhone(rs.getString(4));
						admin.setPower(rs.getInt(5));
						list.add(admin);
					}else{
						list.add(null);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return list;
			}
		}, id).get(0);
	}

	public List findAll() {
		String sql = "select aid,username,password,phone,power from eb_admin where power!=0";
		return DAOHelper.executeQuery(sql, new CallBack() {
			public List getResults(ResultSet rs) {
				List list = new ArrayList();
				Admin admin = null;
				try {
					while(rs.next()){
						admin = new Admin();
						admin.setAid(rs.getInt(1));
						admin.setUsername(rs.getString(2));
						admin.setPassword(rs.getString(3));
						admin.setPhone(rs.getString(4));
						admin.setPower(rs.getInt(5));
						list.add(admin);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return list;
			}
		}, null);
	}

	public Object findSingleObj(Object obj) {
		String sql = "select aid,username,password,phone,power from eb_admin where username=?";
		Admin admin = (Admin)obj;
		return DAOHelper.executeQuery(sql, new CallBack() {
			public List getResults(ResultSet rs) {
				List list = new ArrayList();
				try {
					if(rs.next()){
						Admin admin = new Admin();
						admin.setAid(rs.getInt(1));
						admin.setUsername(rs.getString(2));
						admin.setPassword(rs.getString(3));
						admin.setPhone(rs.getString(4));
						admin.setPower(rs.getInt(5));
						list.add(admin);
					}else{
						list.add(null);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return list;
			}
		}, admin.getUsername()).get(0);
	}

	//������ѯ
	public List findMultipleObj(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
