package kr.ac.dit.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.dit.domain.StudentVO;
import kr.ac.dit.persistence.StudentDAO;
@Service //이클래스는 비지니스 에 들어가는 클래스들이다.
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO studentDAO;
	public void createStudent(StudentVO studentVO) throws Exception {
		studentDAO.insertStudent(studentVO);
	}
	public List<StudentVO> readStudentList() throws Exception {
		return studentDAO.selectStudentList();
	}
}
