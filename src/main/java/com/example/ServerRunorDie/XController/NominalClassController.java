package com.example.ServerRunorDie.XController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerRunorDie.entity.NominalClass;
import com.example.ServerRunorDie.service.NominalClassService;

@RestController
public class NominalClassController {
	@Autowired
	NominalClassService nominalClassService;
	
	@GetMapping(value = "nominalClass/findAll")
	public List<NominalClass> findAll(){
		return nominalClassService.findAll();
	}
	
	@PostMapping(value = "nominalClass/save")
	public List<NominalClass> save(@RequestBody NominalClass at){
		nominalClassService.save(at);
		return nominalClassService.findAll();
	}
	
	@GetMapping(value = "nominalClass/getOne")
	public NominalClass getOne(String id){
		return nominalClassService.getOne(id);
	}
	
	@DeleteMapping(value = "nominalClass/delete")
	public List<NominalClass> delete(@RequestBody NominalClass at){
		nominalClassService.delete(at);
		return nominalClassService.findAll();
	}
	
	@DeleteMapping(value = "nominalClass/delete/{id}")
	public List<NominalClass> deletebyID(@PathVariable("id") String id ){
		nominalClassService.deleteById(id);
		return nominalClassService.findAll();
	}
}
