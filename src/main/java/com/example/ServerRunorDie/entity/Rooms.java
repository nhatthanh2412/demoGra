package com.example.ServerRunorDie.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Rooms")
public class Rooms {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rooms")
	private int id_rooms;
	
	@Column(name = "name",columnDefinition = "nvarchar(50)")
	private String name;
	
	@Column(name = "notes",columnDefinition = "nvarchar(255)")
	private String notes;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_rooms",fetch = FetchType.EAGER)
	private Collection<Schedules> schedules;

	public int getId_rooms() {
		return id_rooms;
	}

	public void setId_rooms(int id_rooms) {
		this.id_rooms = id_rooms;
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

	public Collection<Schedules> getSchedules() {
		return schedules;
	}

	public void setSchedules(Collection<Schedules> schedules) {
		this.schedules = schedules;
	}

	public Rooms(int id_rooms, String name, String notes, Collection<Schedules> schedules) {
		super();
		this.id_rooms = id_rooms;
		this.name = name;
		this.notes = notes;
		this.schedules = schedules;
	}

	public Rooms(int id_rooms, String name, String notes) {
		super();
		this.id_rooms = id_rooms;
		this.name = name;
		this.notes = notes;
	}

	public Rooms() {
		super();
	}

	
	
	
}
