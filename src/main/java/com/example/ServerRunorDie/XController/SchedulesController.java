package com.example.ServerRunorDie.XController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerRunorDie.entity.Schedules;
import com.example.ServerRunorDie.service.ScheduleService;

@RestController
public class SchedulesController {
	@Autowired
	ScheduleService scheduleService;
	@PostMapping(value = "schedules/save")
	public List<Schedules> saveStudent(@RequestBody Schedules stu){
		scheduleService.save(stu);
		return scheduleService.findAll();
	}
	@GetMapping(value = "schedules/findAll")
	public List<Schedules> findAll(){
		return scheduleService.findAll();
	}
	@GetMapping(value = "schedules/getOne/{id}")
	public Schedules findById(@PathVariable("id") String id){
		return scheduleService.getOne(id);
	}
	@DeleteMapping(value = "schedules/delete")
	public List<Schedules> delete(@RequestBody Schedules stu){
		scheduleService.delete(stu);
		return scheduleService.findAll();
	}
	@DeleteMapping(value = "schedules/delete/{id}")
	public List<Schedules> deleteById(@PathVariable String id){
		scheduleService.deleteById(id);
		return scheduleService.findAll();
	}
}
