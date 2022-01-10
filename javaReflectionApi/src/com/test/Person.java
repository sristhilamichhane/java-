package com.test;

public class Person {
	private int a=10;
	private static int k;
	
	Person()
	{
		System.out.println("Heloo");
	}
	Person(int k,int y,int cc)
	{
		this.a=k;
		Person.k=y;
		System.out.println(a+" "+"parameter constructor"+" "+k);
	}
	void add()
	{
		System.out.println("From add"+a);
	}
	void apple()
	{
		System.out.println("From apple"+k);
	}

	public static void main(String[] args) {
		Person p=new Person();
		Person pp=new Person(20,30,40);
		p.add();
		pp.apple();

	}

}
