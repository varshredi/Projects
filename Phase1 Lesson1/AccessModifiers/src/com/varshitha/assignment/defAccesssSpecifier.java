package com.varshitha.assignment;

class defAccesssSpecifier {
	void display() 
    { 
        System.out.println("You are using defalut access specifier"); 
    } 
} 
public class AccessModifiers {

	public static void main(String[] args) {
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
       obj.display(); 


	}

}

