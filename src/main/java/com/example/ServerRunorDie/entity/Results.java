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
@Table(name = "Results")
public class Results {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_results")
	private int id_results;
	
	@Column(name = "name",columnDefinition = "varchar(50)")
	private String name;
	
	@Column(name = "notes",columnDefinition = "varchar(255)")
	private String notes;
	
	@Column(name = "score")
	private double score;
	
	@ManyToOne
	@JoinColumn(name = "id_points")
	private Points id_points;
	
	@ManyToOne
	@JoinColumn(name = "id_class")
	private Clazz id_class;
	
	@ManyToOne
	@JoinColumn(name = "id_students")
	private Students id_students;
	
	@ManyToOne
	@JoinColumn(name = "id_subjects")
	private Subjects id_subjects;

	public int getId_results() {
		return id_results;
	}

	public void setId_results(int id_results) {
		this.id_results = id_results;
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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Points getId_points() {
		return id_points;
	}

	public void setId_points(Points id_points) {
		this.id_points = id_points;
	}

	public Clazz getId_class() {
		return id_class;
	}

	public void setId_class(Clazz id_class) {
		this.id_class = id_class;
	}

	public Students getId_students() {
		return id_students;
	}

	public void setId_students(Students id_students) {
		this.id_students = id_students;
	}

	public Subjects getId_subjects() {
		return id_subjects;
	}

	public void setId_subjects(Subjects id_subjects) {
		this.id_subjects = id_subjects;
	}

	public Results(int id_results, String name, String notes, double score, Points id_points, Clazz id_class,
			Students id_students, Subjects id_subjects) {
		super();
		this.id_results = id_results;
		this.name = name;
		this.notes = notes;
		this.score = score;
		this.id_points = id_points;
		this.id_class = id_class;
		this.id_students = id_students;
		this.id_subjects = id_subjects;
	}

	public Results() {
		super();
	}

	
}
