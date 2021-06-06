package aufgabe06;

import java.util.*;

public class PizzaMenu {
			
		public static boolean existingPizza(Map<String,Double> menu, String pizza)
		{
			if(menu.containsKey(pizza))
			{
				return true;
				}
			return false;
		}
		public static void printPrice(Map<String,Double> menu, String pizza) {
			
			if(existingPizza(menu, pizza)) 
			{
				System.out.println(pizza+ ": "+ menu.get(pizza));
			}
			else 
			{
				System.out.println(pizza + ": Diese Pizza gibt es nicht.");
			}
		}
		
		public static void printMenu(Map<String,Double> menu)
		{
			System.out.printf("%n######################%n%n");
			System.out.printf("Das Menu enthält "+menu.size()+" Pizzen.%n%n");
			if(menu.isEmpty()) 
			{
				System.out.println("########################");
			}
			for(Map.Entry<String, Double> pizza : menu.entrySet())
			{
			    System.out.printf("Pizza " + pizza.getKey() + ": " + pizza.getValue()+" Euro%n");
			}
			System.out.println();
		}
		
		public static void affordablePizza(Map<String,Double> menu, double maxPrice) 
		{
			Set <String> pizzenNamen = new HashSet<>();
			System.out.println("Eingegebener Betrag: " + maxPrice + " Euro");
			for(Map.Entry<String, Double> pizza : menu.entrySet())
			{
			   if(pizza.getValue() <= maxPrice) 
			   {
				   pizzenNamen.add(pizza.getKey());   
			   } 
			}
			
			if(pizzenNamen.isEmpty())
			{
				System.out.println("Leider gibt es zu diesem Preis keine Pizza.");
			}
			else 
			{
				System.out.println("Mögliche Pizzen: " + pizzenNamen);
			}
		}

	public static void main(String[] args) 
	{		
		Map<String, Double> menu = new HashMap<>();
		
		menu.put("Margherita", 7.00);
		menu.put("Veggie", 7.50);
		menu.put("Salami", 8.50);
		menu.put("Schinken", 8.50);
		
		printPrice(menu, "Salami");
		printPrice(menu, "Veggi");
		printMenu(menu);
		
		menu.put("Schinken",8.2);
		System.out.printf("Schninken mit anderem Price%n");
		printMenu(menu);
		
		affordablePizza(menu, 5.0);
		affordablePizza(menu, 8.0);
		
		menu.clear();
		System.out.println();
		printMenu(menu);
		
		menu.put("Verde", 7.0);
		menu.put("Hawaii", 8.2);
		menu.put("Tradizionale",8.5);
		printMenu(menu);
		
		Map<String, Double> menu2 = new HashMap<>();
		menu2.putAll(menu);
		System.out.println("Menu 2");
		printMenu(menu2);
		menu2.remove("Hawaii");
		System.out.println("nachdem Hawaii Pizza gelöscht wurde");
		printMenu(menu2);
	}
}
