package com.class34;

import java.util.Iterator;
import java.util.LinkedList;

/*Create a Set collection that will hold
Objects of Student Type. In this set we do not 
care about the insertion order. Each student 
object should have name and studentID. Display 
name of each student. */

class Student {
	String studentName;
	int id;

	Student(String studentName, int id) {
		this.studentName = studentName;
		this.id = id;
	}

	public void display() {
		System.out.println(id + " " + studentName);
	}

	public static void main(String[] args) {

		Student s1 = new Student("Nick", 101);
		Student s2 = new Student("Sandra", 102);
		Student s3 = new Student("Melissa", 103);
		Student s4 = new Student("Ted", 104);
		Student s5 = new Student("Taisia", 105);

		LinkedList<Student> studlist = new LinkedList<Student>();
		studlist.add(s1);
		studlist.add(s2);
		studlist.add(s3);
		studlist.add(s4);
		studlist.add(s5);

		Iterator<Student> it = studlist.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			s.display();
		}
	}
}
