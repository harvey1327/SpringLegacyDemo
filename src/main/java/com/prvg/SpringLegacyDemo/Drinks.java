package com.prvg.SpringLegacyDemo;

public class Drinks {

	private DrinksCoke drinksCoke;
	
	private DrinksPepsi drinksPepsi;

	private DrinksCoke dCoke;
	
	private DrinksPepsi dPepsi;
	
	public Drinks(){}
	
	public Drinks(DrinksCoke dCoke, DrinksPepsi dPepsi){
		this.dCoke=dCoke;
		this.dPepsi=dPepsi;
	}
	
	public DrinksCoke getDrinksCoke() {
		return drinksCoke;
	}

	public void setDrinksCoke(DrinksCoke drinksCoke) {
		this.drinksCoke = drinksCoke;
	}

	public DrinksPepsi getDrinksPepsi() {
		return drinksPepsi;
	}

	public void setDrinksPepsi(DrinksPepsi drinksPepsi) {
		this.drinksPepsi = drinksPepsi;
	}
	
	public String whatsInTheDrink(){
		String answer="Drink Contains ";
		if(drinksCoke!=null) answer += drinksCoke.talk()+" ";
		if(drinksPepsi!=null) answer += drinksPepsi.talk()+" ";
		return answer;
	}
	
	public String whatsInTheDrinkConstructor(){
		String answer="Drink Cons Contains ";
		if(dCoke!=null) answer += dCoke.talk()+" ";
		if(dPepsi!=null) answer += dPepsi.talk()+" ";
		return answer;
	}
}
