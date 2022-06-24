package com.lyi.d1_xml;

public class Contact {
	private int id;
	private String name;
	private char gender;
	private String email;

	public Contact() {
	}

	public Contact(int id, String name, char gender, String email) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact{" +
				"id=" + id +
				", name='" + name + '\'' +
				", gender=" + gender +
				", email='" + email + '\'' +
				'}';
	}
}
