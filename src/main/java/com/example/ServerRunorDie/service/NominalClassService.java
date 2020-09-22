package com.example.ServerRunorDie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ServerRunorDie.entity.NominalClass;
import com.example.ServerRunorDie.repository.NominalClassRepository;

@Service
public class NominalClassService implements NominalClassRepository{
	@Autowired
	NominalClassRepository repository;
	
	
	@Override
	public List<NominalClass> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<NominalClass> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NominalClass> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NominalClass> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends NominalClass> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<NominalClass> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NominalClass getOne(String id) {
		// TODO Auto-generated method stub
		return repository.getOne(id);
	}

	@Override
	public <S extends NominalClass> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NominalClass> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<NominalClass> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NominalClass> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<NominalClass> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void delete(NominalClass entity) {
		// TODO Auto-generated method stub
		repository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends NominalClass> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends NominalClass> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NominalClass> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends NominalClass> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends NominalClass> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
