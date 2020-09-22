package com.example.ServerRunorDie.XController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerRunorDie.entity.Subjects;
import com.example.ServerRunorDie.service.SubjectService;

@RestController
public class SubjectsController {
	@Autowired
	SubjectService subjectRepository; 
	
	@PostMapping(value = "subject/save")
	public List<Subjects> saveStudent(@RequestBody Subjects stu){
		subjectRepository.save(stu);
		return subjectRepository.findAll();
	}
	@GetMapping(value = "subject/findAll")
	public List<Subjects> findAll(){
		return subjectRepository.findAll();
	}
	@GetMapping(value = "subject/getOne/{id}")
	public Subjects findById(@PathVariable("id") String id){
		return subjectRepository.getOne(id);
	}
	@DeleteMapping(value = "subject/delete")
	public List<Subjects> delete(@RequestBody Subjects stu){
		subjectRepository.delete(stu);
		return subjectRepository.findAll();
	}
	@DeleteMapping(value = "student/delete/{id}")
	public List<Subjects> deleteById(@PathVariable String id){
		subjectRepository.deleteById(id);
		return subjectRepository.findAll();
	}
}
