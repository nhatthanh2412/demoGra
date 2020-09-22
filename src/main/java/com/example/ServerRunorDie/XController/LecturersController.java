package com.example.ServerRunorDie.XController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerRunorDie.entity.Lecturers;
import com.example.ServerRunorDie.service.LecturersService;

@RestController
public class LecturersController {
	@Autowired
	LecturersService lecturersService;
	
	@GetMapping(value = "lecturers/findAll")
	public List<Lecturers> findAll(){
		return lecturersService.findAll();
	}
	
	@PostMapping(value = "Lecturers/save")
	public List<Lecturers> save(@RequestBody Lecturers at){
		lecturersService.save(at);
		return lecturersService.findAll();
	}
	
	@GetMapping(value = "lecturers/getOne")
	public Lecturers getOne(String id){
		return lecturersService.getOne(id);
	}
	
	@DeleteMapping(value = "lecturers/delete")
	public List<Lecturers> delete(@RequestBody Lecturers at){
		lecturersService.delete(at);
		return lecturersService.findAll();
	}
	
	@DeleteMapping(value = "lecturers/delete/{id}")
	public List<Lecturers> deletebyID(@PathVariable("id") String id ){
		lecturersService.deleteById(id);
		return lecturersService.findAll();
	}
}
