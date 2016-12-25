package com.bminor.springtest.projectOne.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/bminor/springtest/projectOne/spring/beans/Beans.xml");
    	
    	
    	Person person = (Person)context.getBean("person");
    	person.speak();
    	
    	Address address = (Address)context.getBean("address");
    	
    	Phone phone = (Phone)context.getBean("phone");
    	
    	System.out.println(person);
    	System.out.println(address);
    	System.out.println(phone);
    	
    	( (ClassPathXmlApplicationContext) context).close();
    }
}
