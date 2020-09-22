package com.example.ServerRunorDie.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Record")
public class Record {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_record")
	private int id_record;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "date")
	private Date date;
	
	@Column(name = "content",columnDefinition = "nvarchar(255)")
	private String content;
	
	@Column(name = "tyle")
	private int tyle;
	
	@Column(name = "notes",columnDefinition = "nvarchar(255)")
	private String notes;
	
	@ManyToOne
	@JoinColumn(name = "id_students")
	private Students id_students;
	
	@ManyToOne
	@JoinColumn(name = "id_semester")
	private Semester id_semester;

	public int getId_record() {
		return id_record;
	}

	public void setId_record(int id_record) {
		this.id_record = id_record;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getTyle() {
		return tyle;
	}

	public void setTyle(int tyle) {
		this.tyle = tyle;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Students getId_students() {
		return id_students;
	}

	public void setId_students(Students id_students) {
		this.id_students = id_students;
	}

	public Semester getId_semester() {
		return id_semester;
	}

	public void setId_semester(Semester id_semester) {
		this.id_semester = id_semester;
	}

	public Record(int id_record, Date date, String content, int tyle, String notes, Students id_students,
			Semester id_semester) {
		super();
		this.id_record = id_record;
		this.date = date;
		this.content = content;
		this.tyle = tyle;
		this.notes = notes;
		this.id_students = id_students;
		this.id_semester = id_semester;
	}

	public Record() {
		super();
	}

	
	
	
}
