package com.example.ServerRunorDie.XController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerRunorDie.entity.Categorys;
import com.example.ServerRunorDie.service.CategorysService;

@RestController
public class CategorysController {
	@Autowired
	CategorysService categorysService;
	
	@GetMapping(value = "categorys/findAll")
	public List<Categorys> findAll(){
		return categorysService.findAll();
	}
	
	@PostMapping(value = "categorys/save")
	public List<Categorys> save(@RequestBody Categorys at){
		categorysService.save(at);
		return categorysService.findAll();
	}
	
	@GetMapping(value = "categorys/getOne")
	public Categorys getOne(String id){
		return categorysService.getOne(id);
	}
	
	@DeleteMapping(value = "categorys/delete")
	public List<Categorys> delete(@RequestBody Categorys at){
		categorysService.delete(at);
		return categorysService.findAll();
	}
	
	@DeleteMapping(value = "categorys/delete/{id}")
	public List<Categorys> deletebyID(@PathVariable("id") String id ){
		categorysService.deleteById(id);
		return categorysService.findAll();
	}
}
