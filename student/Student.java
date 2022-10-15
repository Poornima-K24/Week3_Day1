package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department
{
	public void studentName()
	{
		System.out.println("\n"+"studentName");
	}
	public void studentDept()
	{
		System.out.println("\n"+"studentDept");
	}
	public void studentId()
	{
		System.out.println("\n"+"studentId");
	}
	
	public static void main(String[] args) 
	{
		College c1= new College();
		Department d1= new Department();
		Student s1= new Student();
		
		System.out.println("Multilevel inhertance");
		System.out.println("----College details----");
		c1.collegeCode();
		c1.collegeName();
		c1.collegeName();
		
		System.out.println("\n"+"----Department details----");
		d1.deptName();
		
		System.out.println("\n"+"----Student details----"+"\n");
		s1.studentDept();
		s1.studentId();
		s1.studentName();
		
		
		
		
	}
}
