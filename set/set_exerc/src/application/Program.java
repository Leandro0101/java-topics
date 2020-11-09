package application;

import entities.Course;
import entities.Instructor;
import entities.Student;

public class Program {
	public static void main(String[] args) {
		
		Instructor instructor = new Instructor("Nelio");
		
		Course course = new Course("Java", instructor);
		
		course.addStudents(new Student("Leandro"));
		course.addStudents(new Student("José"));
		
		Course course2 = new Course("C#", instructor);
		
		course2.addStudents(new Student("Vitor"));
		course2.addStudents(new Student("Andrew"));
		course2.addStudents(new Student("Samuel"));
		
		Course course3 = new Course("Ionic", instructor);
		
		course3.addStudents(new Student("João Victor"));
		course3.addStudents(new Student("Samuel"));
		
		instructor.addCourse(course);
		instructor.addCourse(course2);
		instructor.addCourse(course3);
		
		System.out.println(instructor.totalQuantityStudents());
	}
}
