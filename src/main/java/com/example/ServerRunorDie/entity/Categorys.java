package com.example.ServerRunorDie.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Categorys")
public class Categorys {
	@Id
	@Column(name = "id_categorys",columnDefinition = "varchar(20)")
	private String id_categorys;
	
	@Column(name = "name",columnDefinition = "varchar(50)")
	private String name;
	
	@Column(name = "notes",columnDefinition = "varchar(255)")
	private String notes;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id_categorys",fetch = FetchType.EAGER)
	private Collection<Posts> posts;

	public String getId_categorys() {
		return id_categorys;
	}

	public void setId_categorys(String id_categorys) {
		this.id_categorys = id_categorys;
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

	public Collection<Posts> getPosts() {
		return posts;
	}

	public void setPosts(Collection<Posts> posts) {
		this.posts = posts;
	}

	public Categorys(String id_categorys, String name, String notes, Collection<Posts> posts) {
		super();
		this.id_categorys = id_categorys;
		this.name = name;
		this.notes = notes;
		this.posts = posts;
	}

	public Categorys(String id_categorys, String name, String notes) {
		super();
		this.id_categorys = id_categorys;
		this.name = name;
		this.notes = notes;
	}

	public Categorys() {
		super();
	}

	
	
	
}
