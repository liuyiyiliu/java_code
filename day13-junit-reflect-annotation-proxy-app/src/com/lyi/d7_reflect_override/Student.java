package com.lyi.d7_reflect_override;

public class Student {
	private String name;
	private char sex;
	private String className;

	public Student() {
	}

	public Student(String name, char sex, String className) {
		this.name = name;
		this.sex = sex;
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", sex=" + sex +
				", className='" + className + '\'' +
				'}';
	}
}
