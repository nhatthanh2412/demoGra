package com.example.ServerRunorDie.entity;

import java.time.LocalTime;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Skoftes")
public class Skoftes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_skoftes")
	private int id_skoftes;
	
	@Column(name = "name",columnDefinition = "nvarchar(20)")
	private String name;
	
	@Column(name = "start")
	private LocalTime start;
	
	@Column(name = "ends")
	private LocalTime ends;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_skoftes")
	private Collection<Schedules> schedules;

	public int getId_skoftes() {
		return id_skoftes;
	}

	public void setId_skoftes(int id_skoftes) {
		this.id_skoftes = id_skoftes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalTime getStart() {
		return start;
	}

	public void setStart(LocalTime start) {
		this.start = start;
	}

	public LocalTime getEnds() {
		return ends;
	}

	public void setEnds(LocalTime ends) {
		this.ends = ends;
	}

	public Collection<Schedules> getSchedules() {
		return schedules;
	}

	public void setSchedules(Collection<Schedules> schedules) {
		this.schedules = schedules;
	}

	public Skoftes(int id_skoftes, String name, LocalTime start, LocalTime ends, Collection<Schedules> schedules) {
		super();
		this.id_skoftes = id_skoftes;
		this.name = name;
		this.start = start;
		this.ends = ends;
		this.schedules = schedules;
	}

	public Skoftes(int id_skoftes, String name, LocalTime start, LocalTime ends) {
		super();
		this.id_skoftes = id_skoftes;
		this.name = name;
		this.start = start;
		this.ends = ends;
	}

	public Skoftes() {
		super();
	}

	
	
	
}
