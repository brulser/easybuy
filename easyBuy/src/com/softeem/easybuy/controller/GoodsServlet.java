package com.softeem.easybuy.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softeem.easybuy.dao.IGoodsDAO;
import com.softeem.easybuy.dao.impl.GoodsDAO;
import com.softeem.jspsmart.upload.SmartUpload;
import com.softeem.jspsmart.upload.SmartUploadException;

/**
 * Servlet implementation class GoodsServlet
 */
public class GoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * http:���ı�����Э��
	 * ����ͷ--�ͻ��˷�������ʱ��������̨�Ĳ���������
	 * 		   ������������ʽ:
	 * 			1.get����(���������븽���������ַ��ͨ��������������ʱʹ��)ֻ���ύ1024�ֽ�(1kb)���ڵ�����
	 * 			2.post����(���������ݸ���������ͷ�У�ͨ�������������ύ��������ʱʹ��)
	 * ��Ӧͷ--��������˷�����������Ϣ
	 * 
	 * ��Ӧ״̬��
	 * 200~		200			��OK��
	 * 400~		404 405		��not found��
	 * 500~		500 501		��server error��
	 * 
	 * �ͻ��˷���get����ʱ��ִ�и÷���
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get.....");
		doPost(request, response);
	}

	/**
	 * �ͻ��˷���post����ʱ��ִ�и÷���
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String flag = request.getParameter("flag");
		if(flag != null){
			if(flag.equals("del")){
				del(request,response);
			}else if(flag.equals("info")){
				info(request,response);
			}else if(flag.equals("edit")){
				edit(request,response);
			}
		}else{
			try {
				//����SmartUpload����
				SmartUpload su = new SmartUpload();
				//��ʼ��SmartUpload����
				su.initialize(this, request, response);
				//���������ϴ����ļ�����
				su.setAllowedFilesList("png,jpg,gif,jpeg,bmp");
				//���������ϴ��ĵ����ļ���С
				su.setMaxFileSize(1024*1024*10);//���10M
				//���������ϴ����ļ����ܴ�С
				su.setTotalMaxFileSize(1024*1024*100);//���100M
				//�ϴ�
				su.upload();
				//���ļ�Ĭ�������ϴ�����������c��ָ��Ŀ¼��
				String baseDir = "c:/files/test/img";
				//������·��
//				String baseDir = request.getSession().getServletContext().getRealPath("/files");
				//�����ַ�������File����
				java.io.File dir = new java.io.File(baseDir);
				if(!dir.exists()){
					if(dir.mkdirs()){
						System.out.println("Ŀ¼�������:"+dir.getAbsolutePath());
					}
				}
				//�������ļ����浽ָ��Ŀ¼��
				su.save(baseDir);
			
			/*	
				//��ȡ�ϴ��ļ�������
				Files files =  su.getFiles();
				int count = files.getCount();
				System.out.println(count+"<---�ļ���");
				//��ȡÿһ���ļ����洢��ָ��Ŀ¼��
				for(int i = 0;i<count;i++){
					File file = files.getFile(i);
					//�ж��ļ��Ƿ��������
					if(file.getSize() > 0){
						System.out.println("--->����"+file.getSize()+"--->"+file.getFileName());
						//�����ļ���ָ��Ŀ¼
//						file.saveAs(baseDir);
					}
				}
			*/
			} catch (SmartUploadException e) {
				e.printStackTrace();
			}
		}
		
	}
	//�༭��Ʒ
	private void edit(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	//��Ʒ����
	private void info(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	//ɾ����Ʒ
	private void del(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String id = request.getParameter("gid");
		IGoodsDAO dao = new GoodsDAO();
		if(dao.delete(id)){
			response.sendRedirect("list_goods.jsp");
		}
	}

}
