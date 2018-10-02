package kr.ac.dit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.StudentVO;

@Controller
public class SampleController3 {
	@RequestMapping("urlD") 
	public String urlD(Model model) {
		StudentVO studentVO = new StudentVO();
		studentVO.setNo("201514800");
		studentVO.setName("정호익");
		model.addAttribute(studentVO);
		return "read";
	}
}
