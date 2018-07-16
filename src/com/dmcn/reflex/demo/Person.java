package com.dmcn.reflex.demo;

public class Person {
	public String name="熊大";
	private String  age="3";
	protected String address="森林中的树洞";
	//空参构造器与全参构造器
	public Person() {
		super();
	}
	
	public Person(String name, String age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person[name="+name+",age="+age+",address="+address+"]";
	}
	public void study() {
		System.out.println("好好学习");
	}
	public void eat() {
		System.out.println("正在吃东西，请勿打扰");
	}
		
	
	//get/set 方法

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
