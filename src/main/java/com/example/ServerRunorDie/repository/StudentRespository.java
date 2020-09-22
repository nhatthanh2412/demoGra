package com.example.ServerRunorDie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ServerRunorDie.entity.Students;

public interface StudentRespository extends JpaRepository<Students, String>{

}
