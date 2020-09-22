package com.example.ServerRunorDie.XController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerRunorDie.entity.Evaluetes;
import com.example.ServerRunorDie.service.EvaluetesService;

@RestController
public class EvaluetesController {
	@Autowired
	EvaluetesService evaluetesService;
	
	@GetMapping(value = "evaluetes/findAll")
	public List<Evaluetes> findAll(){
		return evaluetesService.findAll();
	}
	
	@PostMapping(value = "evaluetes/save")
	public List<Evaluetes> save(@RequestBody Evaluetes at){
		evaluetesService.save(at);
		return evaluetesService.findAll();
	}
	
	@GetMapping(value = "evaluetes/getOne")
	public Evaluetes getOne(String id){
		return evaluetesService.getOne(id);
	}
	
	@DeleteMapping(value = "evaluetes/delete")
	public List<Evaluetes> delete(@RequestBody Evaluetes at){
		evaluetesService.delete(at);
		return evaluetesService.findAll();
	}
	
	@DeleteMapping(value = "evaluetes/delete/{id}")
	public List<Evaluetes> deletebyID(@PathVariable("id") String id ){
		evaluetesService.deleteById(id);
		return evaluetesService.findAll();
	}
}
