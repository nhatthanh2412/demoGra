package com.example.ServerRunorDie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "NominalClass")
public class NominalClass {
	@Id
	@Column(name = "id_niminalclass",columnDefinition = "varchar(50)")
	private String id_nominalclass;
	
	@Column(name = "name" ,columnDefinition = "varchar(50)")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "id_course")
	private Course id_course;

	public String getId_nominalclass() {
		return id_nominalclass;
	}

	public void setId_nominalclass(String id_nominalclass) {
		this.id_nominalclass = id_nominalclass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getId_course() {
		return id_course;
	}

	public void setId_course(Course id_course) {
		this.id_course = id_course;
	}

	public NominalClass(String id_nominalclass, String name, Course id_course) {
		super();
		this.id_nominalclass = id_nominalclass;
		this.name = name;
		this.id_course = id_course;
	}

	public NominalClass() {
		super();
	}
	
	
}
