package com.mybatis.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import static com.mybatis.common.SqlSessionTemplate.getSession;
/**
 * Servlet implementation class ConnectTestServlet
 */
@WebServlet("/connecttest.do")
public class ConnectTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//mybatis를 이용해서 DB에 접속하기
		//mybatis.jar에서 제공하는 sqlSession클래스를 이용
		//Template클래스를 이용해서 생성
		SqlSession session = getSession();
		System.out.println(session);
		
		//메인화면으로 이동시키기
		response.sendRedirect(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
