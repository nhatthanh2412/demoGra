package com.example.ServerRunorDie.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "Students")
public class Students {
	@Id
	@Column(name = "id_students",columnDefinition = "varchar(20)")
	private String id_students;
	
	@Column(name = "name",columnDefinition = "nvarchar(255)")
	private String name;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "birthday")
	private Date birthday;
	
	@Column(name = "gender")
	private boolean gender;
	
	@Column(name = "email",columnDefinition = "nchar(50)")
	private String email;
	
	@Column(name = "address",columnDefinition = "nvarchar(255)")
	private String address;
	
	@Column(name = "identity_card",columnDefinition = "nchar(15)")
	private String identity_card;
	
	@Column(name = "avt",columnDefinition = "nvarchar(255)")
	private String avt;
	
	@Column(name = "status",columnDefinition = "nvarchar(255)")
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "id_class")
	private Clazz id_class;
	
	@ManyToOne
	@JoinColumn(name = "id_major")
	private Major id_major;
	
	@ManyToOne
	@JoinColumn(name = "id_nominalclass")
	private NominalClass id_niminalclass;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_students",fetch = FetchType.EAGER)
	private Collection<Record> record;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_students",fetch = FetchType.EAGER)
	private Collection<Results> results;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_students",fetch = FetchType.EAGER)
	private Collection<Attends> attends;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_students",fetch = FetchType.EAGER)
	private Collection<Evaluetes> evaluetes;

	public String getId_students() {
		return id_students;
	}

	public void setId_students(String id_students) {
		this.id_students = id_students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
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

	public Clazz getId_class() {
		return id_class;
	}

	public void setId_class(Clazz id_class) {
		this.id_class = id_class;
	}

	public Major getId_major() {
		return id_major;
	}

	public void setId_major(Major id_major) {
		this.id_major = id_major;
	}

	public NominalClass getId_niminalclass() {
		return id_niminalclass;
	}

	public void setId_niminalclass(NominalClass id_niminalclass) {
		this.id_niminalclass = id_niminalclass;
	}

	public Collection<Record> getRecord() {
		return record;
	}

	public void setRecord(Collection<Record> record) {
		this.record = record;
	}

	public Collection<Results> getResults() {
		return results;
	}

	public void setResults(Collection<Results> results) {
		this.results = results;
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

	public Students(String id_students, String name, Date birthday, boolean gender, String email, String address,
			String identity_card, String avt, String status, Clazz id_class, Major id_major,
			NominalClass id_niminalclass, Collection<Record> record, Collection<Results> results,
			Collection<Attends> attends, Collection<Evaluetes> evaluetes) {
		super();
		this.id_students = id_students;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.identity_card = identity_card;
		this.avt = avt;
		this.status = status;
		this.id_class = id_class;
		this.id_major = id_major;
		this.id_niminalclass = id_niminalclass;
		this.record = record;
		this.results = results;
		this.attends = attends;
		this.evaluetes = evaluetes;
	}

	public Students(String id_students, String name, Date birthday, boolean gender, String email, String address,
			String identity_card, String avt, String status, Clazz id_class, Major id_major,
			NominalClass id_niminalclass) {
		super();
		this.id_students = id_students;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.identity_card = identity_card;
		this.avt = avt;
		this.status = status;
		this.id_class = id_class;
		this.id_major = id_major;
		this.id_niminalclass = id_niminalclass;
	}

	public Students() {
		super();
	}

	
	
}
