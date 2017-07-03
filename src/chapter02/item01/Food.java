package chapter02.item01;

import java.util.HashMap;
import java.util.Map;

public class Food {

	private boolean salt = false;
	private String foodName = null;

	private Food(){}	

	private Food(String foodName, Boolean salt){
		this.foodName = foodName;
		this.salt = salt;
	}

	public static Food cookVegetable(Boolean salt){
		return new Food("vegetable", true);
	}

	public static Food boilMilk(Boolean salt){
		return new Food("milk", false);
	}
	
	public static Map<String, Boolean> newInstance(){
		return new HashMap<String, Boolean>();
	}

	public static void main(String[] args){
		Food vegetable = Food.cookVegetable(true);
		Food milk = Food.boilMilk(true);

		Map<String, Boolean> saltInFood = Food.newInstance();
		saltInFood.put(vegetable.foodName, vegetable.salt);
		saltInFood.put(milk.foodName, milk.salt);
		
		System.out.println("Salt content in foods : ");
		System.out.println(saltInFood);
		
	}
}
