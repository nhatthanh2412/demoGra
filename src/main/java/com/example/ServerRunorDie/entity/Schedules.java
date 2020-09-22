package com.example.ServerRunorDie.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Schedules")
public class Schedules {
	@Id
	@GeneratedValue
	@Column(name = "id_schedules")
	private int id_schedules;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "date")
	private Date date;
	
	@Column(name = "description",columnDefinition = "nvarchar(500)")
	private String description;
	
	@Column(name = "notes",columnDefinition = "nvarchar(500)")
	private String notes;
	
	@ManyToOne
	@JoinColumn(name = "id_lecturers")
	private Lecturers id_lecturers;
	
	@ManyToOne
	@JoinColumn(name = "id_skoftes")
	private Skoftes id_skoftes;
	
	@ManyToOne
	@JoinColumn(name = "id_class")
	private Clazz id_class;
	
	@ManyToOne
	@JoinColumn(name = "id_subjects")
	private Subjects id_subjects;
	
	@ManyToOne
	@JoinColumn(name = "id_rooms")
	private Rooms id_rooms;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_schedules",fetch = FetchType.EAGER)
	private Collection<Attends> attends;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_schedules",fetch = FetchType.EAGER)
	private Collection<Evaluetes> evaluetes;

	public int getId_schedules() {
		return id_schedules;
	}

	public void setId_schedules(int id_schedules) {
		this.id_schedules = id_schedules;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Skoftes getId_skoftes() {
		return id_skoftes;
	}

	public void setId_skoftes(Skoftes id_skoftes) {
		this.id_skoftes = id_skoftes;
	}

	public Clazz getId_class() {
		return id_class;
	}

	public void setId_class(Clazz id_class) {
		this.id_class = id_class;
	}

	public Subjects getId_subjects() {
		return id_subjects;
	}

	public void setId_subjects(Subjects id_subjects) {
		this.id_subjects = id_subjects;
	}

	public Rooms getId_rooms() {
		return id_rooms;
	}

	public void setId_rooms(Rooms id_rooms) {
		this.id_rooms = id_rooms;
	}

	public Collection<Attends> getAttends() {
		return attends;
	}

	public void setAttends(Collection<Attends> attends) {
		this.attends = attends;
	}

	public Collection<Evaluetes> getEvaluetes() {
		return evaluetes;
	}

	public void setEvaluetes(Collection<Evaluetes> evaluetes) {
		this.evaluetes = evaluetes;
	}

	public Schedules(int id_schedules, Date date, String description, String notes, Lecturers id_lecturers,
			Skoftes id_skoftes, Clazz id_class, Subjects id_subjects, Rooms id_rooms, Collection<Attends> attends,
			Collection<Evaluetes> evaluetes) {
		super();
		this.id_schedules = id_schedules;
		this.date = date;
		this.description = description;
		this.notes = notes;
		this.id_lecturers = id_lecturers;
		this.id_skoftes = id_skoftes;
		this.id_class = id_class;
		this.id_subjects = id_subjects;
		this.id_rooms = id_rooms;
		this.attends = attends;
		this.evaluetes = evaluetes;
	}

	public Schedules(int id_schedules, Date date, String description, String notes, Lecturers id_lecturers,
			Skoftes id_skoftes, Clazz id_class, Subjects id_subjects, Rooms id_rooms) {
		super();
		this.id_schedules = id_schedules;
		this.date = date;
		this.description = description;
		this.notes = notes;
		this.id_lecturers = id_lecturers;
		this.id_skoftes = id_skoftes;
		this.id_class = id_class;
		this.id_subjects = id_subjects;
		this.id_rooms = id_rooms;
	}

	public Schedules() {
		super();
	}

	
	
}
