package com.mybatis.modal.service;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.modal.dao.StudentDao;
import com.mybatis.modal.vo.Student;
import com.mybatis.modal.vo.Student2;

import static com.mybatis.common.SqlSessionTemplate.getSession; 
public class StudentService {
	
	private StudentDao dao = new StudentDao();
	
	public int insertStudent() {
		SqlSession session = getSession();
		int result = dao.insertStudent(session);
		//트렌젝션처리
		if(result>0) session.commit();
		else session.rollback();
		
		session.close();
		return result;
	}
	public int insertStudentByName(String name) {
		SqlSession session = getSession();
		int result = dao.insertStudentByName(session,name);
		//트렌젝션처리
		if(result>0) session.commit();
		else session.rollback();
		session.close();
		return result;
		
	}
	public int insertStudentAll(Student s) {
		SqlSession session = getSession();
		int result =dao.insertStudentAll(session, s);
		if(result>0) session.commit();
		else session.rollback();
		session.close();
		return result;
	}
	public int selectStudentCount() {
		SqlSession session=getSession();
		int result=dao.selectStudnetCount(session);
		session.close();
		return result;
	}
	public Student selectStudentByNo(int no) {
		SqlSession session = getSession();
		Student s=dao.selectStudentByNo(session, no);
		session.close();
		return s;
		
	}
}
