package org.department;

import org.college.College;

public class Department extends College {
	
public void deptName() {
	
	System.out.println("The department id is : CSE");
}	

public static void main(String[] args) {
	 Department dt =new Department();
	 dt.deptName();
	 dt.collegeCode();
	 dt.collegeCode();
	 dt.collegeRank();
	 
}
}
