package com.example.ServerRunorDie.XController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ServerRunorDie.entity.Clazz;
import com.example.ServerRunorDie.service.ClazzService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClazzController {
	@Autowired
	ClazzService clazzService;
	
	@GetMapping(value = "clazz/findAll")
	public List<Clazz> findAll(){
		return clazzService.findAll();
	}
	
	@PostMapping(value = "clazz/save")
	public List<Clazz> save(@RequestBody Clazz at){
		clazzService.save(at);
		return clazzService.findAll();
	}
	
	@GetMapping(value = "clazz/getOne")
	public Clazz getOne(String id){
		return clazzService.getOne(id);
	}
	
	@DeleteMapping(value = "clazz/delete")
	public List<Clazz> delete(@RequestBody Clazz at){
		clazzService.delete(at);
		return clazzService.findAll();
	}
	
	@DeleteMapping(value = "clazz/delete/{id}")
	public List<Clazz> deletebyID(@PathVariable("id") String id ){
		clazzService.deleteById(id);
		return clazzService.findAll();
	}
}
