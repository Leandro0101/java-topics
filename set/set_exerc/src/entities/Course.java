package entities;

import java.util.ArrayList;
import java.util.List;

public class Course implements Comparable<Course> {
	private String name;
	private Instructor instructor;
	private List<Student> students = new ArrayList<>();
	
	public Course(String name, Instructor instructor) {
		this.name = name;
		this.instructor = instructor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void addStudents(Student student) {
		students.add(student);
	}
	@Override
	public int compareTo(Course other) {
		return name.compareTo(other.name);
	}
}
