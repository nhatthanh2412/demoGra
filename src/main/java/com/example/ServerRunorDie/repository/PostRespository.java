package com.example.ServerRunorDie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ServerRunorDie.entity.Posts;

public interface PostRespository extends JpaRepository<Posts, String>{

}
