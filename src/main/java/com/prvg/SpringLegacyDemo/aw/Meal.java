package com.prvg.SpringLegacyDemo.aw;

public class Meal {

	private Fruitaw fruitaw;
	
	private Vegetableaw vegetableaw;
	
	public Meal(){}
	
	public Meal(Fruitaw fruitaw, Vegetableaw vegetableaw){
		this.fruitaw=fruitaw;
		this.vegetableaw=vegetableaw;
	}

	public Fruitaw getFruit() {
		return fruitaw;
	}

	public void setFruitaw(Fruitaw fruitaw) {
		this.fruitaw = fruitaw;
	}

	public Vegetableaw getVeg() {
		return vegetableaw;
	}

	public void setVegetableaw(Vegetableaw vegetableaw) {
		this.vegetableaw = vegetableaw;
	}
	
	public String toString(){
		String result="Meal contains: ";
		if(getFruit()!=null){
			result+=getFruit().getMyName()+" , ";
		}
		if(getVeg()!=null){
			result+=getVeg().getMyName();
		}
		return result;
	}
}
