package com.caffeineshawn.demo.User;


import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String name_id;
	private String name;
	private String id;

	@Override
	public String toString() {
		return "{" + " name_id='" + getName_id() + "'" + ", name='" + getName() + "', id='" + getId() + "'}";
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getName_id() {
		return name_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName_id(String name_id) {
		this.name_id = name_id;
	}
}
