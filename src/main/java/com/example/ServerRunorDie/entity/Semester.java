package com.example.ServerRunorDie.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Semester")
public class Semester {
	@Id
	@Column(name = "id_semester",columnDefinition = "varchar(20)")
	private String id_semester;
	
	@Column(name = "name",columnDefinition = "varchar(50)")
	private String name;
	
	@Column(name = "notes",columnDefinition = "varchar(255)")
	private String notes;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_semester",fetch = FetchType.EAGER)
	private Collection<Clazz> clazz;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_semester",fetch = FetchType.EAGER)
	private Collection<Record> record;

	public String getId_semester() {
		return id_semester;
	}

	public void setId_semester(String id_semester) {
		this.id_semester = id_semester;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Collection<Clazz> getClazz() {
		return clazz;
	}

	public void setClazz(Collection<Clazz> clazz) {
		this.clazz = clazz;
	}

	public Collection<Record> getRecord() {
		return record;
	}

	public void setRecord(Collection<Record> record) {
		this.record = record;
	}

	public Semester(String id_semester, String name, String notes, Collection<Clazz> clazz, Collection<Record> record) {
		super();
		this.id_semester = id_semester;
		this.name = name;
		this.notes = notes;
		this.clazz = clazz;
		this.record = record;
	}

	public Semester(String id_semester, String name, String notes) {
		super();
		this.id_semester = id_semester;
		this.name = name;
		this.notes = notes;
	}

	public Semester() {
		super();
	}
	
	
}
