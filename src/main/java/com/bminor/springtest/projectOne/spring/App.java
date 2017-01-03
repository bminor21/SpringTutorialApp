package com.bminor.springtest.projectOne.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bminor.springtest.projectOne.spring.Phone.PhoneType;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/bminor/springtest/projectOne/spring/beans/Beans.xml");
    	
    	
    	Person person = (Person)context.getBean("person");
    	
    	Address address = (Address)context.getBean("address");
    	
    	Phone phone = (Phone)context.getBean("phone");
    	phone.setPhoneNumber("567-890-1234");
    	phone.setPhoneType( PhoneType.MOBILE );

    	System.out.println(person);
    	System.out.println(address);
    	System.out.println(phone);
    	
    	person.getPhoneNumbers().put( PhoneType.MOBILE, phone );

    	System.out.print("Person has the following number in the map: ");
    	System.out.println( person.getPhoneNumbers() );
    	
    	( (ClassPathXmlApplicationContext) context).close();
    }
}
