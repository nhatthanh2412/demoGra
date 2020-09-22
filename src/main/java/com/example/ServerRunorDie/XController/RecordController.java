package com.example.ServerRunorDie.XController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerRunorDie.entity.Record;
import com.example.ServerRunorDie.service.RecordService;

@RestController
public class RecordController {
	@Autowired
	RecordService recordService;
	
	@PostMapping(value = "record/save")
	public List<Record> saveStudent(@RequestBody Record stu){
		recordService.save(stu);
		return recordService.findAll();
	}
	@GetMapping(value = "record/findAll")
	public List<Record> findAll(){
		return recordService.findAll();
	}
	@GetMapping(value = "record/getOne/{id}")
	public Record findById(@PathVariable("id") int id){
		return recordService.getOne(id);
	}
	@DeleteMapping(value = "record/delete")
	public List<Record> delete(@RequestBody Record stu){
		recordService.delete(stu);
		return recordService.findAll();
	}
	@DeleteMapping(value = "record/delete/{id}")
	public List<Record> deleteById(@PathVariable int id){
		recordService.deleteById(id);
		return recordService.findAll();
	}
}
