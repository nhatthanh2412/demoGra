package com.example.ServerRunorDie.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Points")
public class Points {
	@Id
	@GeneratedValue
	@Column(name = "id_points")
	private int id_points;
	
	@Column(name = "namecore",columnDefinition = "nvarchar(50)")
	private String namecore;
	
	@Column(name = "tyle")
	private double tyle;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_points",fetch = FetchType.EAGER)
	private Collection<Results> results;

	public int getId_points() {
		return id_points;
	}

	public void setId_points(int id_points) {
		this.id_points = id_points;
	}

	public String getNamecore() {
		return namecore;
	}

	public void setNamecore(String namecore) {
		this.namecore = namecore;
	}

	public double getTyle() {
		return tyle;
	}

	public void setTyle(double tyle) {
		this.tyle = tyle;
	}

	public Collection<Results> getResults() {
		return results;
	}

	public void setResults(Collection<Results> results) {
		this.results = results;
	}

	public Points(int id_points, String namecore, double tyle, Collection<Results> results) {
		super();
		this.id_points = id_points;
		this.namecore = namecore;
		this.tyle = tyle;
		this.results = results;
	}

	public Points(int id_points, String namecore, double tyle) {
		super();
		this.id_points = id_points;
		this.namecore = namecore;
		this.tyle = tyle;
	}

	public Points() {
		super();
	}

	
	
	
}
