package com.vignesh.student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vignesh.student.Model.Student;
import com.vignesh.student.Repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository studentRepository;

	@PostMapping("save")
	public String addStudent(@RequestBody Student student) {
		studentRepository.save(student);
		return "Success";
	}

	@GetMapping("getRegId")
	public String getRegId() {
		String l = "SR" + studentRepository.count();
		return l;
	}

	@GetMapping("getStudentList")
	public List<Student> getList() {
		List<Student> list = studentRepository.findAll();
		return list;
	}

}
