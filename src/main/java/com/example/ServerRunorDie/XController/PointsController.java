package com.example.ServerRunorDie.XController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerRunorDie.entity.Points;
import com.example.ServerRunorDie.service.PointsService;

@RestController
public class PointsController {
	@Autowired
	PointsService pointsService;
	@PostMapping(value = "point/save")
	public List<Points> saveStudent(@RequestBody Points stu){
		pointsService.save(stu);
		return pointsService.findAll();
	}
	@GetMapping(value = "point/findAll")
	public List<Points> findAll(){
		return pointsService.findAll();
	}
	@GetMapping(value = "point/getOne/{id}")
	public Points findById(@PathVariable("id") int id){
		return pointsService.getOne(id);
	}
	@DeleteMapping(value = "point/delete")
	public List<Points> delete(@RequestBody Points stu){
		pointsService.delete(stu);
		return pointsService.findAll();
	}
	@DeleteMapping(value = "point/delete/{id}")
	public List<Points> deleteById(@PathVariable int id){
		pointsService.deleteById(id);
		return pointsService.findAll();
	}
}
