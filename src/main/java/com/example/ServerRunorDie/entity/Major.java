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
@Table(name = "Major")
public class Major {
	@Id
	@Column(name = "id_major",columnDefinition = "varchar(20)")
	private String id_major;
	
	@Column(name = "name",columnDefinition = "varchar(255)")
	private String name;
	
	@Column(name = "notes",columnDefinition = "varchar(255)")
	private String notes;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_major",fetch = FetchType.EAGER)
	private Collection<Students> students;

	public String getId_major() {
		return id_major;
	}

	public void setId_major(String id_major) {
		this.id_major = id_major;
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

	public Collection<Students> getStudents() {
		return students;
	}

	public void setStudents(Collection<Students> students) {
		this.students = students;
	}

	public Major(String id_major, String name, String notes, Collection<Students> students) {
		super();
		this.id_major = id_major;
		this.name = name;
		this.notes = notes;
		this.students = students;
	}

	public Major() {
		super();
	}

	public Major(String id_major, String name, String notes) {
		super();
		this.id_major = id_major;
		this.name = name;
		this.notes = notes;
	}
	
	
}
