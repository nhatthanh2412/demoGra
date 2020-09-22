package com.example.ServerRunorDie.XController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerRunorDie.entity.Major;
import com.example.ServerRunorDie.service.MajorService;

@RestController
public class MajorController {
	@Autowired
	MajorService majorService;
	
	@GetMapping(value = "major/findAll")
	public List<Major> findAll(){
		return majorService.findAll();
	}
	
	@PostMapping(value = "major/save")
	public List<Major> save(@RequestBody Major at){
		majorService.save(at);
		return majorService.findAll();
	}
	
	@GetMapping(value = "major/getOne")
	public Major getOne(String id){
		return majorService.getOne(id);
	}
	
	@DeleteMapping(value = "major/delete")
	public List<Major> delete(@RequestBody Major at){
		majorService.delete(at);
		return majorService.findAll();
	}
	
	@DeleteMapping(value = "major/delete/{id}")
	public List<Major> deletebyID(@PathVariable("id") String id ){
		majorService.deleteById(id);
		return majorService.findAll();
	}
}
