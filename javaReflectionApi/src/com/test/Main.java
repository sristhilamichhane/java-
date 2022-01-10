package com.test;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
public class Main {

	public static void main(String[] args) {
		try
		{
			Class c=Class.forName("com.test.Person");
			System.out.println("Name is:"+c.getName());
			System.out.println("Name is:"+c.getSuperclass().getName());
			
		    Person person=(Person)c.newInstance();
			person.add();
			person.apple();
			
			
			Field []f=c.getDeclaredFields();
			for(Field field:f)
			{
				System.out.println(field);
			}
			
			
			Constructor []cons=c.getDeclaredConstructors();
			for(Constructor cc:cons)
			{
				System.out.println(cc);
			}
			
			
			Method []m=c.getDeclaredMethods();
			for(Method mm:m)
			{
				System.out.println(mm);		
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
