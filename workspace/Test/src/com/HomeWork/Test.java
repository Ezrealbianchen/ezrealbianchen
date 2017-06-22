package com.HomeWork;

import java.util.Scanner;

class Student {
	
	private int age;
	private String name;
	private String gender;
	private String phone;
	private String address;
	private String email;
	
	Student() {
		age = 0;
		name = "无";
		gender = "不详";
		phone = "无";
		address = "不详";
		email = "不详";
	}
	
	Student(int age,String name,String gender,
			String phone,String address,
			String email) {
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.name = name;
		this.phone = phone;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	
	public String getGender(){
		return this.gender;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public String getPhone(){
		return this.phone;
	}
	
	public void setAddress(String add){
		this.address = add;
	}
	
	public String getAddress(){
		return this.address ;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void play() {
		System.out.println("玩");
	}
	
	public void sleep() {
		System.out.println("睡");
	}
	
	public void eat() {
		System.out.println("吃");
	}
}


class Undergraduate {
	private Student stu;
	private String department;
	public Undergraduate() {
		stu = new Student();
	}
	public Undergraduate(Student s,String de) {
		stu = s;
		department = de;
	}
	public void setDeprtment(String de) {
		this.department = de;
		
	}
	
	public void show() {
		System.out.println(stu.getPhone());
		System.out.println(department);
	}
}

public class Test {
	
	public void serachName(String name,Student[] arrays) {
		boolean flag = false;
		for(int i=0;i<arrays.length;i++) {
			if(arrays[i].getName().equals(name)){
				System.out.println(arrays[i].getPhone());
				flag = true;
			}
		}
		if(flag==false)
			System.out.println("很抱歉并没有相匹配的用户~");
	}
	
	public void serachEmail(String email,Student[] arrays) {
		boolean flag = false;
		for(int i=0;i<arrays.length;i++) {
			if(arrays[i].getEmail().equals(email)){
				System.out.println(arrays[i].getName());
				flag = true;
			}
		}
		if(flag==false)
			System.out.println("很抱歉没有相匹配的用户~");
	}
	
	
	public static void main(String[] args) {
		//Student[] stu = new Student[10];
		//for(int i=0;i<10;i++) {
		//	stu[i] = new Student();
		//}
		
		//stu[2].setName("老爸");
		//stu[2].setPhone("13085248755");
		//stu[2].setEmail("a");
		//Scanner d = new Scanner(System.in);
		
		//String a = d.nextLine();
		//new Test().serachName(a, stu);
		//new Test().serachEmail("a", stu);
		
		Student stu = new Student();
		Undergraduate und = new Undergraduate(stu, "机电");
		und.show();
	}
}