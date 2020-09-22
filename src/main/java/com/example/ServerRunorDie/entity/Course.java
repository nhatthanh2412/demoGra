package com.example.ServerRunorDie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {
	@Id
	@Column(name = "id_course",columnDefinition = "varchar(20)")
	private String id_course;
	
	@Column(name = "name",columnDefinition = "nvarchar(50)")
	private String name;

	public Course(String id_course, String name) {
		super();
		this.id_course = id_course;
		this.name = name;
	}

	public String getId_course() {
		return id_course;
	}

	public void setId_course(String id_course) {
		this.id_course = id_course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course() {
		super();
	}
	
}
