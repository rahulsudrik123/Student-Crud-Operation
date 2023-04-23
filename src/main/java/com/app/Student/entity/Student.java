package com.app.Student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table
public class Student {
	@Id
	@NotNull
	@Column
	private int id;
	@NotNull
	@Column
	private String name;
	@NotNull
	@Column
	private int age;
	@NotNull
	@Column
	private String course;
	@NotNull
	@Column
	private String collegeName;
	
	public Student()
	{
		System.out.println("Default Constuctor for Student Class");
	}
	
	public Student(int id,String name,int age,String course,String collegeName)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.course=course;
		this.collegeName=collegeName;
	}
	
	public int getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public String getCourse()
	{
		return this.course;
	}
	public String getCollegeName()
	{
		return this.collegeName;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String Name)
	{
		this.name=Name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setCourse(String course)
	{
		this.course=course;
	}
	public void setCollegeName(String collegeName)
	{
		this.collegeName=collegeName;
	}
	
	@Override
	public String toString()
	{
		return "Student("+"id="+this.id+"Name="+this.name+"Age="+this.age+"Course"+this.course+"Collage Name"+this.collegeName+")";
	}
}
