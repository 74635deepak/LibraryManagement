package com.example.LibraryManagement;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "Name Required")
	private String name;
	
	@NotBlank(message = "Author Required")
	private String author;
	
	@NotBlank(message = "Required")
	private String about;

	public Books() {
		
	}

	public Books(Integer id, @NotBlank(message = "Name Required") String name,
			@NotBlank(message = "Author Required") String author, @NotBlank(message = "Required") String about) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.about = about;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
	
}
