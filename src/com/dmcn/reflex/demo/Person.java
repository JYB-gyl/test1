package com.dmcn.reflex.demo;

public class Person {
	public String name="�ܴ�";
	private String  age="3";
	protected String address="ɭ���е�����";
	//�ղι�������ȫ�ι�����
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
		System.out.println("�ú�ѧϰ");
	}
	public void eat() {
		System.out.println("���ڳԶ������������");
	}
		
	
	//get/set ����

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
