package com.prvg.SpringLegacyDemo;

public class Vegetable {

	private int value=1;
	
	private String myName;
	
	public void setMyName(String myName){
		this.myName=myName;
	}
	
	public String getMyName(){
		return myName;
	}
	
	public String talk(){
		value++;
		return "I am a Vegetable with "+myName;
	}
	
	public int getValue(){
		return value;
	}
}
