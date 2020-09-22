package com.example.ServerRunorDie.XController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerRunorDie.entity.Students;
import com.example.ServerRunorDie.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@PostMapping(value = "student/save")
	public List<Students> saveStudent(@RequestBody Students stu){
		studentService.save(stu);
		return studentService.findAll();
	}
	@GetMapping(value = "student/findAll")
	public List<Students> findAll(){
		return studentService.findAll();
	}
	@GetMapping(value = "student/getOne/{id}")
	public Students findById(@PathVariable("id") String id){
		return studentService.getOne(id);
	}
	@DeleteMapping(value = "student/delete")
	public List<Students> delete(@RequestBody Students stu){
		studentService.delete(stu);
		return studentService.findAll();
	}
	@DeleteMapping(value = "student/delete/{id}")
	public List<Students> deleteById(@PathVariable String id){
		studentService.deleteById(id);
		return studentService.findAll();
	}
}
