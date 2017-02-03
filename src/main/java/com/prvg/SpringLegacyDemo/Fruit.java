package com.prvg.SpringLegacyDemo;

public class Fruit {
	
	private String myName="null";
	
	private int value=1;

	public String getmyName(){
		return myName;
	}
	
	public void setMyName(String myName){
		this.myName=myName;
	}
	
	public Fruit(){}
	
	public Fruit(String myName){
		setMyName(myName);
	}
	
	public String talk(){
		value++;
		return "I am a fruit of type "+myName;
	}
	
	public int getValue(){
		return value;
	}
}
