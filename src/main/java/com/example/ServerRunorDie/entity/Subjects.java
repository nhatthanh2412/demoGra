package com.example.ServerRunorDie.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Subjects")
public class Subjects {
	@Id
	@Column(name = "id_subjects",columnDefinition = "varchar(20)")
	private String id_subjects;
	
	@Column(name = "name",columnDefinition = "varchar(50)")
	private String name;
	
	@Column(name = "credit")
	private int credit;
	
	@Column(name = "session")
	private int session;
	
	@Column(name = "notes",columnDefinition = "varchar(255)")
	private String notes;
	
	@ManyToOne
	@JoinColumn(name = "id_class")
	private Clazz id_class;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_subjects",fetch = FetchType.EAGER)
	private Collection<Schedules> schedules;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_subjects",fetch = FetchType.EAGER)
	private Collection<Results> results;

	public String getId_subjects() {
		return id_subjects;
	}

	public void setId_subjects(String id_subjects) {
		this.id_subjects = id_subjects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getSession() {
		return session;
	}

	public void setSession(int session) {
		this.session = session;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Clazz getId_class() {
		return id_class;
	}

	public void setId_class(Clazz id_class) {
		this.id_class = id_class;
	}

	public Collection<Schedules> getSchedules() {
		return schedules;
	}

	public void setSchedules(Collection<Schedules> schedules) {
		this.schedules = schedules;
	}

	public Collection<Results> getResults() {
		return results;
	}

	public void setResults(Collection<Results> results) {
		this.results = results;
	}

	public Subjects(String id_subjects, String name, int credit, int session, String notes, Clazz id_class,
			Collection<Schedules> schedules, Collection<Results> results) {
		super();
		this.id_subjects = id_subjects;
		this.name = name;
		this.credit = credit;
		this.session = session;
		this.notes = notes;
		this.id_class = id_class;
		this.schedules = schedules;
		this.results = results;
	}

	public Subjects(String id_subjects, String name, int credit, int session, String notes, Clazz id_class) {
		super();
		this.id_subjects = id_subjects;
		this.name = name;
		this.credit = credit;
		this.session = session;
		this.notes = notes;
		this.id_class = id_class;
	}

	public Subjects() {
		super();
	}

	
}
