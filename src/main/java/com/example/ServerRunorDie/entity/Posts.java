package com.example.ServerRunorDie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Posts")
public class Posts {
	@Id
	@Column(name = "id_post",columnDefinition = "nvarchar(255)")
	private String id_post;
	
	@Column(name = "title",columnDefinition = "nvarchar(255)")
	private String title;
	
	@Column(name = "description",columnDefinition = "nvarchar(500)")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "id_categorys")
	private Categorys id_categorys;

	public String getId_post() {
		return id_post;
	}

	public void setId_post(String id_post) {
		this.id_post = id_post;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Categorys getId_categorys() {
		return id_categorys;
	}

	public void setId_categorys(Categorys id_categorys) {
		this.id_categorys = id_categorys;
	}

	public Posts(String id_post, String title, String description, Categorys id_categorys) {
		super();
		this.id_post = id_post;
		this.title = title;
		this.description = description;
		this.id_categorys = id_categorys;
	}

	public Posts() {
		super();
	}
	
	
}
