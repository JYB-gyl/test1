package com.dmcn.reflex.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;




public class reflexMain {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//1.��ȡ�ֽ����ļ�
		Class clazz=Class.forName("com.dmcn.reflex.demo.Person");
		//��ù��췽��
		Constructor<?>[] constructors = clazz.getConstructors();
		
		for(Constructor<?> constructor:constructors) {
		//System.out.println(constructor);
		}
		//��ȡpublic private ���ε����й��췽��
		Constructor<?>[] declaredConstructors=clazz.getDeclaredConstructors();
		
		for(Constructor<?> constructor:declaredConstructors) {
		//System.out.println(declaredConstructors);
		}
		//��ȡָ�����вι��췽��
		//getDeclaredConstructor ��ȡ�вεķ���
		//getConstructor ��ȡ�޲εķ���
		Constructor<?> constructor=clazz.getDeclaredConstructor(String.class,String.class,String.class);
		constructor.setAccessible(true);//�ҵ��ӽ��ķ���
		
		Constructor<?> constructor2=clazz.getConstructor();
		//�����޲ι���Ķ���
		//ͨ�����췽����������:newInstance();
		Person person =(Person) constructor2.newInstance();
//		System.out.println(person);
		 //��������:��ֹjava��������
		Person person1=(Person) constructor.newInstance("����","100","ɭ��");
		System.out.println(person1);
		
		ArrayList a=new ArrayList();
		
		Class<?> c=Class.forName(Canstants.LIST_PATH);
		//��ʽ���
		List<String> list = (List<String>) c.getDeclaredConstructor().newInstance();
		list.add("������������");
		System.out.println(list.get(0));
		
	}
		
		 //ͨ�������ó�Ա����
	   
	    public void testCreateField() throws Exception {
	        
	        //1.����ֽ������
	        Class<?> clazz = Class.forName("com.dmcn.felect.demo.Person");
//	        
//	       //2.ͨ���ֽ�������ñ���
//	        Field[] fields = clazz.getFields();
//	        for (Field field : fields) {
//	          //public java.lang.String com.dmcn.felect.demo.Person.name
//	            //System.out.println(field);
//	        }
//	        
//	        Field[] declaredFields = clazz.getDeclaredFields();
//	        for (Field field : declaredFields) {
//	            /**
//	             * public java.lang.String com.dmcn.felect.demo.Person.name
//	             * private java.lang.String com.dmcn.felect.demo.Person.age
//	             * protected java.lang.String com.dmcn.felect.demo.Person.school
//	             * java.lang.String com.dmcn.felect.demo.Person.address
//	             *
//	             */
//	           // System.out.println(field);
//	        }
//	        
//	        //Person person = new Person();
//	        //System.out.println(person.getName() +"---"+ person.getAge() +"---"+ person.getSchool() +"---"+person.getAddress());
	//    
//	        //2.���ֽ��봴��������
//	        Constructor<?> constructor = clazz.getConstructor();
	        
	        //3.���޲ι�������������
//	        Person person1 = (Person) constructor.newInstance();
//	        String name = person1.getName();
//	        System.out.println(name);
//	        String age = person1.getAge();
//	        System.out.println(age);
//	        String address = person1.getAddress();
//	        System.out.println(address);
	        //4.���вι���ȥ��������
	        
	        
	        //Person per = new Person("","","","");
	        
	        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(String.class,String.class,String.class,String.class);
	        declaredConstructor.setAccessible(true);
	        Person person2 = (Person) declaredConstructor.newInstance("1","2","3","4");
	        System.out.println(person2);
	        
	        person2.study();
	}
	    //�÷����ȡ����
	   
	    public void testCreateMethod() throws Exception{
	    	//��ȡ�ֽ����ļ�
	    	Class clazz=Class.forName("com.dmcn.reflex.demo.Person");
	    	//��ȡpublicȨ�޵ķ���
	    	Method[] methods=clazz.getMethods();
	    	for(Method method:methods) {
	    		//System.out.println(method);
	    	}
	    	//��ȡpublic ��public���εķ���
	    	Method[] declaredMethods=clazz.getDeclaredMethods();
	    	for(Method method:declaredMethods) {
	    		//System.err.println(method);
	    	}
	    	 Constructor<?> constructor = clazz.getConstructor();
	    	 Person person=(Person)constructor.newInstance();
	    	 //��ȡָ���ķ���
	    	 Method method=clazz.getMethod("study");
	    	 System.out.println(method);
	    	  //�����������
	         //method.invoke(person);
	    	 Class<?> clazz1 = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
	         System.out.println(clazz1);
	    }
}
