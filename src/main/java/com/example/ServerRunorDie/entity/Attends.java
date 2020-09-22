package com.example.ServerRunorDie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Attends")
public class Attends {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_attends")
	private int id_attends;
	
	@Column(name = "Status")
	private int status;
	
	@Column(name = "Notes",columnDefinition = "nvarchar(255)")
	private String notes;
	
	@ManyToOne
	@JoinColumn(name = "id_schedules")
	private Schedules id_schedules;
	
	@ManyToOne
	@JoinColumn(name = "id_students")
	private Students id_students;

	public int getId_attends() {
		return id_attends;
	}

	public void setId_attends(int id_attends) {
		this.id_attends = id_attends;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Schedules getId_schedules() {
		return id_schedules;
	}

	public void setId_schedules(Schedules id_schedules) {
		this.id_schedules = id_schedules;
	}

	public Students getId_students() {
		return id_students;
	}

	public void setId_students(Students id_students) {
		this.id_students = id_students;
	}

	public Attends(int id_attends, int status, String notes, Schedules id_schedules, Students id_students) {
		super();
		this.id_attends = id_attends;
		this.status = status;
		this.notes = notes;
		this.id_schedules = id_schedules;
		this.id_students = id_students;
	}

	public Attends() {
		super();
	}

	
	
}
