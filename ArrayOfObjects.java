package com.arrayOfObjects;

public class ArrayOfObjects {

	public static void main(String [] args) {
		//declare array of student 
		Student [] arr;
		//size 
		arr = new Student[3];
		//inti
		arr[0] = new Student(101,"abc","A");
		arr[1] = new Student(102,"pqr","B");
		arr[2] = new Student(103,"xyz","C");
		
		System.out.println("first Student data= ");
		arr[0].display();
		
		System.out.println("second Student data= ");
		arr[1].display();
		
		System.out.println("third Student data= ");
		arr[2].display();
		
	}
}

class Student {
	
	
	int rollno;
	String name;
	String grade;
	
	//constructor
	Student(int rollno, String name, String grade){
	this.rollno=rollno;
	this.name=name;
	this.grade=grade;
	}
	
	
	
	
	//display
	 public void display() {
	 System.out.println("Student data: "+rollno+" "+name+" "+grade);
	 
}
	 
}

