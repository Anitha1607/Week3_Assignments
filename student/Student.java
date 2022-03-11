package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		
		System.out.println("The name is : Anitha");
	}

	public void studentDept() {
		
		System.out.println("The Dept is CSE");
		
	}
	
	
	public void studentId() {
		
		System.out.println("The Student id is :10589899");
		
	}
	
	public static void main(String[] args) {
		Student st =new Student();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentId();
		st.studentDept();
	}
	

	}

