package com.dmcn.reflex.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;




public class reflexMain {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//1.获取字节码文件
		Class clazz=Class.forName("com.dmcn.reflex.demo.Person");
		//获得构造方法
		Constructor<?>[] constructors = clazz.getConstructors();
		
		for(Constructor<?> constructor:constructors) {
		//System.out.println(constructor);
		}
		//获取public private 修饰的所有构造方法
		Constructor<?>[] declaredConstructors=clazz.getDeclaredConstructors();
		
		for(Constructor<?> constructor:declaredConstructors) {
		//System.out.println(declaredConstructors);
		}
		//获取指定的有参构造方法
		//getDeclaredConstructor 获取有参的方法
		//getConstructor 获取无参的方法
		Constructor<?> constructor=clazz.getDeclaredConstructor(String.class,String.class,String.class);
		constructor.setAccessible(true);//找到接近的方法
		
		Constructor<?> constructor2=clazz.getConstructor();
		//创建无参构造的对象
		//通过构造方法创建对象:newInstance();
		Person person =(Person) constructor2.newInstance();
//		System.out.println(person);
		 //暴力反射:防止java来代码检查
		Person person1=(Person) constructor.newInstance("熊三","100","森林");
		System.out.println(person1);
		
		ArrayList a=new ArrayList();
		
		Class<?> c=Class.forName(Canstants.LIST_PATH);
		//链式编程
		List<String> list = (List<String>) c.getDeclaredConstructor().newInstance();
		list.add("张三不是李四");
		System.out.println(list.get(0));
		
	}
		
		 //通过反射获得成员变量
	   
	    public void testCreateField() throws Exception {
	        
	        //1.获得字节码对象
	        Class<?> clazz = Class.forName("com.dmcn.felect.demo.Person");
//	        
//	       //2.通过字节码对象获得变量
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
//	        //2.用字节码创建构造器
//	        Constructor<?> constructor = clazz.getConstructor();
	        
	        //3.用无参构造器创建对象
//	        Person person1 = (Person) constructor.newInstance();
//	        String name = person1.getName();
//	        System.out.println(name);
//	        String age = person1.getAge();
//	        System.out.println(age);
//	        String address = person1.getAddress();
//	        System.out.println(address);
	        //4.用有参构造去创建对象
	        
	        
	        //Person per = new Person("","","","");
	        
	        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(String.class,String.class,String.class,String.class);
	        declaredConstructor.setAccessible(true);
	        Person person2 = (Person) declaredConstructor.newInstance("1","2","3","4");
	        System.out.println(person2);
	        
	        person2.study();
	}
	    //用反射获取方法
	   
	    public void testCreateMethod() throws Exception{
	    	//获取字节码文件
	    	Class clazz=Class.forName("com.dmcn.reflex.demo.Person");
	    	//获取public权限的方法
	    	Method[] methods=clazz.getMethods();
	    	for(Method method:methods) {
	    		//System.out.println(method);
	    	}
	    	//获取public 非public修饰的方法
	    	Method[] declaredMethods=clazz.getDeclaredMethods();
	    	for(Method method:declaredMethods) {
	    		//System.err.println(method);
	    	}
	    	 Constructor<?> constructor = clazz.getConstructor();
	    	 Person person=(Person)constructor.newInstance();
	    	 //获取指定的方法
	    	 Method method=clazz.getMethod("study");
	    	 System.out.println(method);
	    	  //输出方法内容
	         //method.invoke(person);
	    	 Class<?> clazz1 = Class.forName("com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter");
	         System.out.println(clazz1);
	    }
}
