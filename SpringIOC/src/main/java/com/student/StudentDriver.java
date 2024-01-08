package com.student;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class StudentDriver {

	public static void main(String[] args) {

//		ClassPathResource resource = new ClassPathResource("student.xml") ;
//		BeanFactory factory = new  XmlBeanFactory(resource);
//		 Object bean = factory.getBean("stu");
//		System.out.println(bean);

//		XmlBeanFactory xml = new XmlBeanFactory(new ClassPathResource("student.xml"));
//		Student s2 = (Student) xml.getBean("stu");
//		System.out.println(s2);
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
//		Student s1 = context.getBean(Student.class, "stu");
//		System.out.println(s1);

//		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
//		Student bean = context.getBean(Student.class,"stu");
//		System.out.println(bean);

//		ApplicationContext context1 = new ClassPathXmlApplicationContext("student.xml");
//		Employee e = context1.getBean(Employee.class, "emp");
//
//		System.out.println(e);

		ApplicationContext con = new ClassPathXmlApplicationContext("student.xml");
//		Student s = con.getBean(Student.class);
//		System.out.println(s);
//
//		Laptop l = con.getBean(Laptop.class, "  ");
//		System.out.println(l);
//		
		Employee e =  (Employee) con.getBean(Employee.class,"emp");
		System.out.println(e);

	}

}
