package com.example.ServerRunorDie.XController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerRunorDie.entity.Rooms;
import com.example.ServerRunorDie.service.RoomService;

@RestController
public class RoomsController {
	@Autowired
	RoomService roomService;
	@PostMapping(value = "room/save")
	public List<Rooms> saveStudent(@RequestBody Rooms stu){
		roomService.save(stu);
		return roomService.findAll();
	}
	@GetMapping(value = "room/findAll")
	public List<Rooms> findAll(){
		return roomService.findAll();
	}
	@GetMapping(value = "room/getOne/{id}")
	public Rooms findById(@PathVariable("id") int id){
		return roomService.getOne(id);
	}
	@DeleteMapping(value = "room/delete")
	public List<Rooms> delete(@RequestBody Rooms stu){
		roomService.delete(stu);
		return roomService.findAll();
	}
	@DeleteMapping(value = "room/delete/{id}")
	public List<Rooms> deleteById(@PathVariable int id){
		roomService.deleteById(id);
		return roomService.findAll();
	}
}
