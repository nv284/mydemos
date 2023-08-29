package com.example.SpringDemo11;

import jakarta.persistence.*;

@Entity
public class User1 {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Integer id;

	  private String name;

	  private String email;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User1(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

}
