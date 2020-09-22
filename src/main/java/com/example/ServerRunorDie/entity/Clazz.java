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
@Table(name = "Class")
public class Clazz {
	@Id
	@Column(name = "id_class",columnDefinition = "varchar(50)")
	private String id_class;
	
	@Column(name = "name",columnDefinition = "nvarchar(50)")
	private String name;
	
	@Column(name = "status")
	private boolean status;
	
	@ManyToOne
	@JoinColumn(name = "id_semester")
	private Semester id_semester;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_class",fetch = FetchType.EAGER)
	private Collection<Students> students;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_class",fetch = FetchType.EAGER)
	private Collection<Results> results;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_class",fetch = FetchType.EAGER)
	private Collection<Subjects> subjects;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_class",fetch = FetchType.EAGER)
	private Collection<Schedules> schedules;

	public String getId_class() {
		return id_class;
	}

	public void setId_class(String id_class) {
		this.id_class = id_class;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Semester getId_semester() {
		return id_semester;
	}

	public void setId_semester(Semester id_semester) {
		this.id_semester = id_semester;
	}

	public Collection<Students> getStudents() {
		return students;
	}

	public void setStudents(Collection<Students> students) {
		this.students = students;
	}

	public Collection<Results> getResults() {
		return results;
	}

	public void setResults(Collection<Results> results) {
		this.results = results;
	}

	public Collection<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(Collection<Subjects> subjects) {
		this.subjects = subjects;
	}

	public Collection<Schedules> getSchedules() {
		return schedules;
	}

	public void setSchedules(Collection<Schedules> schedules) {
		this.schedules = schedules;
	}

	public Clazz(String id_class, String name, boolean status, Semester id_semester, Collection<Students> students,
			Collection<Results> results, Collection<Subjects> subjects, Collection<Schedules> schedules) {
		super();
		this.id_class = id_class;
		this.name = name;
		this.status = status;
		this.id_semester = id_semester;
		this.students = students;
		this.results = results;
		this.subjects = subjects;
		this.schedules = schedules;
	}

	public Clazz(String id_class, String name, boolean status, Semester id_semester) {
		super();
		this.id_class = id_class;
		this.name = name;
		this.status = status;
		this.id_semester = id_semester;
	}

	public Clazz() {
		super();
	}

	
	
	
}
