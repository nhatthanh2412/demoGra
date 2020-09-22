package com.example.ServerRunorDie.XController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerRunorDie.entity.Attends;
import com.example.ServerRunorDie.service.AttendsService;

@RestController
public class AttendsController {
	@Autowired
	AttendsService attendsService;

	@GetMapping(value = "attends/findAll")
	public List<Attends> findAll(){
		return attendsService.findAll();
	}
	
	@PostMapping(value = "attends/save")
	public List<Attends> save(@RequestBody Attends at){
		attendsService.save(at);
		return attendsService.findAll();
	}
	
	@GetMapping(value = "attends/getOne")
	public Attends getOne(int id){
		return attendsService.getOne(id);
	}
	
	@DeleteMapping(value = "attends/delete")
	public List<Attends> delete(@RequestBody Attends at){
		attendsService.delete(at);
		return attendsService.findAll();
	}
	
	@DeleteMapping(value = "attends/delete/{id}")
	public List<Attends> deletebyID(@PathVariable("id") int id ){
		attendsService.deleteById(id);
		return attendsService.findAll();
	}
	
}
