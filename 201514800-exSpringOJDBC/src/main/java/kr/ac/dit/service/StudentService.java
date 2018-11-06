package kr.ac.dit.service;

import java.util.List;

import kr.ac.dit.domain.StudentVO;

public interface StudentService {
	public void createStudent(StudentVO studentVO)throws Exception; //insert 하는거
	public List<StudentVO> readStudentList() throws Exception;
}
