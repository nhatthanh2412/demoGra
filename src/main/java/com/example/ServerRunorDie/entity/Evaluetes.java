package com.example.ServerRunorDie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Evaluetes")
public class Evaluetes {
	@Id
	@Column(name = "id_evaluetes",columnDefinition = "varchar(20)")
	private String id_evaluetes;
	
	@Column(name = "punctual")
	private int punctual;
	
	@Column(name = "quality")
	private int quality;
	
	@Column(name = "reply")
	private int reply;
	
	@Column(name = "date")
	private int date;
	
	@Column(name = "notes",columnDefinition = "varchar(255)")
	private String notes;
	
	@ManyToOne
	@JoinColumn(name = "id_lecturers")
	private Lecturers id_lecturers;
	
	@ManyToOne
	@JoinColumn(name = "id_students")
	private Students id_students;

	@ManyToOne
	@JoinColumn(name = "id_schedules")
	private Schedules id_schedules;

	public String getId_evaluetes() {
		return id_evaluetes;
	}

	public void setId_evaluetes(String id_evaluetes) {
		this.id_evaluetes = id_evaluetes;
	}

	public int getPunctual() {
		return punctual;
	}

	public void setPunctual(int punctual) {
		this.punctual = punctual;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public int getReply() {
		return reply;
	}

	public void setReply(int reply) {
		this.reply = reply;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Lecturers getId_lecturers() {
		return id_lecturers;
	}

	public void setId_lecturers(Lecturers id_lecturers) {
		this.id_lecturers = id_lecturers;
	}

	public Students getId_students() {
		return id_students;
	}

	public void setId_students(Students id_students) {
		this.id_students = id_students;
	}

	public Schedules getId_schedules() {
		return id_schedules;
	}

	public void setId_schedules(Schedules id_schedules) {
		this.id_schedules = id_schedules;
	}

	public Evaluetes(String id_evaluetes, int punctual, int quality, int reply, int date, String notes,
			Lecturers id_lecturers, Students id_students, Schedules id_schedules) {
		super();
		this.id_evaluetes = id_evaluetes;
		this.punctual = punctual;
		this.quality = quality;
		this.reply = reply;
		this.date = date;
		this.notes = notes;
		this.id_lecturers = id_lecturers;
		this.id_students = id_students;
		this.id_schedules = id_schedules;
	}

	public Evaluetes() {
		super();
	}

	
	
	
}
