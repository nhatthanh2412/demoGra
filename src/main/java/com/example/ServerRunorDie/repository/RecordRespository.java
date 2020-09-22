package com.example.ServerRunorDie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ServerRunorDie.entity.Record;

public interface RecordRespository extends JpaRepository<Record, Integer>{

}
