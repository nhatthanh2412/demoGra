package com.example.ServerRunorDie.XController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerRunorDie.entity.Posts;
import com.example.ServerRunorDie.service.PostService;

@RestController
public class PostsController {
	@Autowired
	PostService postService;
	@PostMapping(value = "post/save")
	public List<Posts> saveStudent(@RequestBody Posts stu){
		postService.save(stu);
		return postService.findAll();
	}
	@GetMapping(value = "post/findAll")
	public List<Posts> findAll(){
		return postService.findAll();
	}
	@GetMapping(value = "post/getOne/{id}")
	public Posts findById(@PathVariable("id") String id){
		return postService.getOne(id);
	}
	@DeleteMapping(value = "post/delete")
	public List<Posts> delete(@RequestBody Posts stu){
		postService.delete(stu);
		return postService.findAll();
	}
	@DeleteMapping(value = "post/delete/{id}")
	public List<Posts> deleteById(@PathVariable String id){
		postService.deleteById(id);
		return postService.findAll();
	}
}
