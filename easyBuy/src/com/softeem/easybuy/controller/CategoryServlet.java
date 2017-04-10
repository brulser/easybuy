package com.softeem.easybuy.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.softeem.easybuy.service.CategoryService;

/**
 * M:ģ�Ͳ�(����ģ�ͣ�ҵ��ģ��)
 * V:��ͼ��(jsp)
 * C:���Ʋ�(servlet)
 * 
 * Servlet implementation class CategoryServlet
 */
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("ajax");
		//��ѯ���з��࣬�����ص�ǰ��
		CategoryService service= new CategoryService();
		//��ȡ���з���
		List list = service.searAll();
		if("on".equals(type)){
			//���ɷ���˵�
			String json = new Gson().toJson(list);
			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			out.print(json);
			out.flush();
		}else{
			//�����ϴ���request��Χ
			request.setAttribute("c", list);
			//ҳ����ת��ͬʱ�������������¼������ݣ�
			request.getRequestDispatcher("add_goods.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
