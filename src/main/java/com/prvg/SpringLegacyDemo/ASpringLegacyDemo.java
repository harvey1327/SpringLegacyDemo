package com.prvg.SpringLegacyDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.prvg.SpringLegacyDemo.aw.Meal;

public class ASpringLegacyDemo {

	public static void main(String[] args) {
		autoWire();
	}
	
	private static void autoWire(){
		ApplicationContext appContext = new FileSystemXmlApplicationContext("AutoWireAppContext.xml");
		
		Meal mealAWByType = appContext.getBean("mealAWByType", Meal.class);
		System.out.println(mealAWByType);
		
		Meal mealAWByName=appContext.getBean("mealAWByName", Meal.class);
		System.out.println(mealAWByName);
		
		Meal mealAWByCons=appContext.getBean("mealAWByCons", Meal.class);
		System.out.println(mealAWByCons);
		
		((FileSystemXmlApplicationContext)  appContext).close();
	}
	
	@SuppressWarnings("unused")
	private static void nonAutoWire(){
		ApplicationContext appContext = new FileSystemXmlApplicationContext("AppContext.xml");
		
		ApplicationContext appContext2 = new ClassPathXmlApplicationContext("AppContext2.xml");
		
		Fruit fruit1=(Fruit) appContext.getBean("fruit");
		Fruit fruit2=(Fruit) appContext.getBean("fruit");
		Fruit appleFruit = (Fruit) appContext.getBean("fruitwithnameofapple");
		
		Vegetable veg1= appContext.getBean("vegetable",Vegetable.class);
		Vegetable veg2= appContext.getBean("vegetable",Vegetable.class);
		Vegetable vegName= appContext.getBean("vegetableWithName",Vegetable.class);
		Vegetable vegUsingPNameSpace= appContext.getBean("vegUsingPNameSpace",Vegetable.class);
		
		
		
		System.out.println(fruit1.talk()+" | "+veg1.talk());
		System.out.println(fruit2.getValue()+" | "+veg2.getValue());
		System.out.println(appleFruit.talk());
		System.out.println(vegName.talk());
		System.out.println(vegUsingPNameSpace.talk());
		
		Animals animals =(Animals) appContext2.getBean("animals", Animals.class); 
		System.out.println(animals.getAnimalList()+" | "+animals.getAnimalMap());
		
		Drinks drinks = appContext2.getBean("drinks", Drinks.class);
		Drinks drinksCon = appContext2.getBean("drinksCon", Drinks.class);
		System.out.println(drinks.whatsInTheDrink());
		System.out.println(drinksCon.whatsInTheDrinkConstructor());
		
		((FileSystemXmlApplicationContext)  appContext).close();
		((ClassPathXmlApplicationContext)  appContext2).close();
	}

}
