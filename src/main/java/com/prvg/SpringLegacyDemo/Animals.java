package com.prvg.SpringLegacyDemo;

import java.util.List;
import java.util.Map;

public class Animals {
	
	private List<String> animalList;
	
	private Map<String,String> animalMap;

	public List<String> getAnimalList() {
		return animalList;
	}

	public void setAnimalList(List<String> animalList) {
		this.animalList = animalList;
	}

	public Map<String,String> getAnimalMap() {
		return animalMap;
	}

	public void setAnimalMap(Map<String,String> animalMap) {
		this.animalMap = animalMap;
	}
	
	public void init(){
		System.out.println(this.getClass().getName()+" Bean has been init");
	}
	
	public void destroy(){
		System.out.println(this.getClass().getName()+" Bean has been destroy");
	}

}
