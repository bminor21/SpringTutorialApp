package com.bminor.springtest.projectOne.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/bminor/springtest/projectOne/spring/beans/Beans.xml");
    	
    	
    	Person person = (Person)context.getBean("person");
    	
    	Address address = (Address)context.getBean("address");
    	
    	Phone phone = (Phone)context.getBean("phone");
    	
    	System.out.println(person);
    	System.out.println(address);
    	System.out.println(phone);
    	
    	if( person.getPhoneNumbers().containsKey( Phone.PhoneType.MOBILE ) )
    	{
    		System.out.print("Person has the following number in the map: ");
    		System.out.println( person.getPhoneNumbers().get( Phone.PhoneType.MOBILE).toString() );
    	}
    	
    	( (ClassPathXmlApplicationContext) context).close();
    }
}
