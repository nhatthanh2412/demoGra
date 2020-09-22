package com.example.ServerRunorDie.XController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerRunorDie.entity.Skoftes;
import com.example.ServerRunorDie.service.SkofteService;


@RestController
public class SkoftesController {
	@Autowired
	SkofteService skofteRespository;
	
	@PostMapping(value = "skoftes/save")
	public List<Skoftes> saveStudent(@RequestBody Skoftes stu){
		skofteRespository.save(stu);
		return skofteRespository.findAll();
	}
	@GetMapping(value = "skoftes/findAll")
	public List<Skoftes> findAll(){
		return skofteRespository.findAll();
	}
	@GetMapping(value = "skoftes/getOne/{id}")
	public Skoftes findById(@PathVariable("id") int id){
		return skofteRespository.getOne(id);
	}
	@DeleteMapping(value = "skoftes/delete")
	public List<Skoftes> delete(@RequestBody Skoftes stu){
		skofteRespository.delete(stu);
		return skofteRespository.findAll();
	}
	@DeleteMapping(value = "skoftes/delete/{id}")
	public List<Skoftes> deleteById(@PathVariable int id){
		skofteRespository.deleteById(id);
		return skofteRespository.findAll();
	}
}
