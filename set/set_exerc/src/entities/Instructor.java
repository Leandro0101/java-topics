package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Instructor {

	private String name;
	private List<Course> courses = new ArrayList<Course>();

	public Instructor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void addCourse(Course course) {
		courses.add(course);
	}

	public int totalQuantityStudents() {
		Set<Student> allStudents = new TreeSet<Student>();
		for (Course c : getCourses()) {
			for (Student s : c.getStudents()) {
				allStudents.add(s);
			}
		}
		return allStudents.size();
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", courses=" + courses + "]";
	}

}
