package com.example.ServerRunorDie.XController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerRunorDie.entity.Results;
import com.example.ServerRunorDie.service.ResultService;

@RestController
public class ResultsController {
	@Autowired
	ResultService resultService;
	
	@PostMapping(value = "result/save")
	public List<Results> saveStudent(@RequestBody Results stu){
		resultService.save(stu);
		return resultService.findAll();
	}
	@GetMapping(value = "result/findAll")
	public List<Results> findAll(){
		return resultService.findAll();
	}
	@GetMapping(value = "result/getOne/{id}")
	public Results findById(@PathVariable("id") int id){
		return resultService.getOne(id);
	}
	@DeleteMapping(value = "result/delete")
	public List<Results> delete(@RequestBody Results stu){
		resultService.delete(stu);
		return resultService.findAll();
	}
	@DeleteMapping(value = "result/delete/{id}")
	public List<Results> deleteById(@PathVariable int id){
		resultService.deleteById(id);
		return resultService.findAll();
	}
}
