package com.laura.springcache.domain;

public class Student {
	String id;
	String name;
	String studentClass;

	public Student(String id, String name, String clz) {
		super();
		this.id = id;
		this.name = name;
		this.studentClass = clz;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

}
