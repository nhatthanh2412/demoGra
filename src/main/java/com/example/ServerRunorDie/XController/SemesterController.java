package com.example.ServerRunorDie.XController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerRunorDie.entity.Semester;
import com.example.ServerRunorDie.service.SemesterService;

@RestController
public class SemesterController {
	@Autowired
	SemesterService semesterService;
	
	@PostMapping(value = "semester/save")
	public List<Semester> saveStudent(@RequestBody Semester stu){
		semesterService.save(stu);
		return semesterService.findAll();
	}
	@GetMapping(value = "semester/findAll")
	public List<Semester> findAll(){
		return semesterService.findAll();
	}
	@GetMapping(value = "semester/getOne/{id}")
	public Semester findById(@PathVariable("id") String id){
		return semesterService.getOne(id);
	}
	@DeleteMapping(value = "semester/delete")
	public List<Semester> delete(@RequestBody Semester stu){
		semesterService.delete(stu);
		return semesterService.findAll();
	}
	@DeleteMapping(value = "semester/delete/{id}")
	public List<Semester> deleteById(@PathVariable String id){
		semesterService.deleteById(id);
		return semesterService.findAll();
	}
}
