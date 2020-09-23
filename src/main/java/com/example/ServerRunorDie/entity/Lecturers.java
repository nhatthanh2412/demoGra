package com.example.ServerRunorDie.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Lecturers")
public class Lecturers {
	@Id
	@Column(name = "id_lecturers",columnDefinition = "varchar(20)")
	private String id_lecturers;
	
	@Column(name = "name",columnDefinition = "varchar(50)")
	private String name;
	
	@Column(name = "gender")
	private boolean gender;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "birthday")
	private Date birthday;
	
	@Column(name = "email",columnDefinition = "varchar(50)")
	private String email;
	
	@Column(name="address",columnDefinition = "varchar(255)")
	private String address;
	
	@Column(name = "identity_card",columnDefinition = "varchar(5)")
	private String identity_card;
	
	@Column(name = "avt")
	private String avt;
	
	@Column(name = "status")
	private String status;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_lecturers",fetch = FetchType.EAGER)
	private Collection<Schedules> schedules;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_lecturers",fetch = FetchType.EAGER)
	private Collection<Evaluetes> evaluetes;

	public String getId_lecturers() {
		return id_lecturers;
	}

	public void setId_lecturers(String id_lecturers) {
		this.id_lecturers = id_lecturers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdentity_card() {
		return identity_card;
	}

	public void setIdentity_card(String identity_card) {
		this.identity_card = identity_card;
	}

	public String getAvt() {
		return avt;
	}

	public void setAvt(String avt) {
		this.avt = avt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Collection<Schedules> getSchedules() {
		return schedules;
	}

	public void setSchedules(Collection<Schedules> schedules) {
		this.schedules = schedules;
	}

	public Collection<Evaluetes> getEvaluetes() {
		return evaluetes;
	}

	public void setEvaluetes(Collection<Evaluetes> evaluetes) {
		this.evaluetes = evaluetes;
	}

	public Lecturers(String id_lecturers, String name, boolean gender, Date birthday, String email, String address,
			String identity_card, String avt, String status, Collection<Schedules> schedules,
			Collection<Evaluetes> evaluetes) {
		super();
		this.id_lecturers = id_lecturers;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.email = email;
		this.address = address;
		this.identity_card = identity_card;
		this.avt = avt;
		this.status = status;
		this.schedules = schedules;
		this.evaluetes = evaluetes;
	}

	public Lecturers(String id_lecturers, String name, boolean gender, Date birthday, String email, String address,
			String identity_card, String avt, String status) {
		super();
		this.id_lecturers = id_lecturers;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.email = email;
		this.address = address;
		this.identity_card = identity_card;
		this.avt = avt;
		this.status = status;
	}

	public Lecturers() {
		super();
	}

	
}
