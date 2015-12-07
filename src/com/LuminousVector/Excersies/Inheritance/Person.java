package com.LuminousVector.Excersies.Inheritance;

import com.LuminousVector.Utils.Debug;

public class Person
{
	public String name;
	public int age;
	public String gender;

	public Person(String name)
	{
		this(name, 0, null);
	}

	public Person(String name, int age)
	{
		this(name, age, null);
	}

	public Person(String name, int age, String gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Person Print()
	{
		Debug.log("Name: " + name);
		Debug.log("Age: " + age);
		Debug.log("Gender: " + gender);
		return this;
	}
}
