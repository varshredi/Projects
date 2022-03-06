package com.varshitha.assignment;

	class Std
	{
		int id;
		String name;
		Std(int i,String n)
		{
		id=i;
		name=n;
		}
		void display() 
		{
		System.out.println(id+" "+name);
		}
		}

	public class Democonstructor {
		public static void main(String[] args)
		{
		Std std1=new Std(5,"Alex");
		Std std2=new Std(20,"Annie");
		std1.display();
		std2.display();
		}

	}

