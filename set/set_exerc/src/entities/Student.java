package entities;

import java.util.List;

public class Student implements Comparable<Student> {
	
	private String name;
	private List<Course> course;
	
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourse() {
		return course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	@Override
	public int compareTo(Student other) {
		return name.compareTo(other.name);
	}
}
