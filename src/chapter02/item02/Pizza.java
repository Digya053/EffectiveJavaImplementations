package chapter02.item02;

public class Pizza {

	private final int quantity;
	private final String size;
	private final boolean cheese;
	private final boolean flour;
	private final boolean dough;
	private final boolean tomatoSauce;
	private int calorie = 0;
	private int totalFat = 0;
	private int calcium = 0;
	private int protein = 0;
	private int cholesterol = 0;

	public static class Builder {

		private int quantity = 0;
		private String size = null;
		private boolean cheese = false;
		private boolean flour = false;
		private boolean dough = false;
		private boolean tomatoSauce = false;
		private int calorie = 0;
		private int totalFat = 0;
		private int calcium = 0;
		private int protein = 0;
		private int cholesterol = 0;

		public Builder(int quantity, String size){
			this.quantity = quantity; 
			this.size = size;
		}

		public Builder containCheese(Boolean cheese){
			this.cheese = cheese;
			return this;
		}

		public Builder containFlour(Boolean flour){
			this.flour = flour;
			return this;
		}

		public Builder containDough(Boolean dough){
			this.dough = dough;
			return this;
		}

		public Builder containTomatoSauce(Boolean tomatoSauce){
			this.tomatoSauce = tomatoSauce;
			return this;
		}

		public Builder calorieValue(int value){
			this.calorie = value;
			return this;
		}

		public Builder totalFatValue(int value){
			this.totalFat = value;
			return this;
		}

		public Builder calciumValue(int value){
			this.calcium = value;
			return this;
		}

		public Builder proteinValue(int value){
			this.protein = value;
			return this;
		}

		public Builder cholesterolValue(int value){
			this.cholesterol = value;
			return this;
		}

		public Pizza build(){
			return new Pizza(this);
		}
	}

	public Pizza(Builder builder){
		quantity = builder.quantity;
		size = builder.size;
		cheese = builder.cheese;
		flour = builder.flour;
		dough = builder.dough;
		tomatoSauce = builder.tomatoSauce;
		calorie = builder.calorie;
		totalFat = builder.totalFat;
		calcium = builder.calcium;
		protein = builder.protein;
		cholesterol = builder.cholesterol;
	}

	@Override
	public String toString(){
		return "Pizza : "
				+ " quantity = " + quantity + "," + 
				" size = " + size + "," + 
				" cheese = " + cheese + "," + 
				" flour = " + flour + "," + 
				" dough = " + dough + "," + 
				" tomatoSauce = "  + tomatoSauce + "," + 
				" calorie = " + calorie + "," + 
				" totalFat = " + totalFat + "," + 
				" calcium = " + calcium + "," + 
				" protein = " + protein + "," + 
				" cholesterol  = " + cholesterol;
	}

	public static void main(String[] args){
		Pizza pizza = new Pizza.Builder(3, "large").containCheese(true).
				containFlour(true).containDough(true).containTomatoSauce(true).
				calorieValue(20).totalFatValue(20).calciumValue(100).proteinValue(100)
				.cholesterolValue(20).build();

		System.out.println(pizza.toString());
	}	
}