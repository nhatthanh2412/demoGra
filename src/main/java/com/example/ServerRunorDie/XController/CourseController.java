package com.example.ServerRunorDie.XController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerRunorDie.entity.Course;
import com.example.ServerRunorDie.service.CourseService;

@RestController
public class CourseController {
	@Autowired 
	CourseService courseService;
	
	@GetMapping(value = "course/findAll")
	public List<Course> findAll(){
		return courseService.findAll();
	}
	
	@PostMapping(value = "course/save")
	public List<Course> save(@RequestBody Course at){
		courseService.save(at);
		return courseService.findAll();
	}
	
	@GetMapping(value = "course/getOne")
	public Course getOne(String id){
		return courseService.getOne(id);
	}
	
	@DeleteMapping(value = "course/delete")
	public List<Course> delete(@RequestBody Course at){
		courseService.delete(at);
		return courseService.findAll();
	}
	
	@DeleteMapping(value = "course/delete/{id}")
	public List<Course> deletebyID(@PathVariable("id") String id ){
		courseService.deleteById(id);
		return courseService.findAll();
	}
}
