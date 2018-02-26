package com.sam.hit.demo;

public class Application {
	public static void main(String args[]){
		Employee emp= new Employee("1" ,"sam" ,"eng");
		
		System.out.println("hi GitHub. This is from eclipse idea good to meet you!");
		System.out.println();
	        System.out.println("Find the details of the employee below");
		System.out.println(" -----------------");
		System.out.println(" | " +emp.getId() +" | " + emp.getfName()+" | " +emp.getPosition() +" | " );
		System.out.println(" -----------------");
		
	}

}
