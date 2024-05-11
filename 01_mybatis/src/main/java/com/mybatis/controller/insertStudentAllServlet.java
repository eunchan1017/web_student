package com.mybatis.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.modal.service.StudentService;
import com.mybatis.modal.vo.Student;


@WebServlet("/student/insertstudentall.do")
public class insertStudentAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertStudentAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//클라이언트가 보낸 데이터를 DB에 저장하는 기능이 doGet이다.
		//저장하는 위치는 HttpServletRequest, HttpServletResponse에 저장한다.
		//HttpServletRequest은 요청에 대한 내용을 정리해서 가지고 있다.
		//HttpServletResponse은 응답에 대한 내용을 정리해서 가지고 있다.
		//클라이언트가 보낸 데이터는 getParameter(), getParameterValues()
		//getParameter()는 단일의 데이터를 반환한다. 예시 : String
		//getParameterValues()는 다수의 데이터를 반환한다. 예시 : String[].
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		
		Student s = new Student();
		s.setStudentName(name);
		s.setStudentPhone(phone);
		s.setStudentEmail(email);
		s.setStudentAddress(address);
		
		
		//DB에 저장하는 코드 ↓
		int result=new StudentService().insertStudentAll(s);
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//
		doGet(request, response);
	}

}
