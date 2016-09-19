package com.sjsu.shim.multithreading;

import java.util.HashMap;
import java.util.Map;

public class Order {

	private Map<Dish, Integer> orderedDishes = new HashMap<Dish, Integer>();
	private int cost = 0;

	public void addOrder(String name, int quantity) {
		orderedDishes.put(new Dish(name), quantity);
	}

	public Map<Dish, Integer> getOrderedDishes() {
		return orderedDishes;
	}

	public void setOrderedDishes(Map<Dish, Integer> orderedDishes) {
		this.orderedDishes = orderedDishes;
	}

	public int getOrderCost() {
		this.cost = 0;
		for (Dish d : orderedDishes.keySet()) {
			this.cost += d.getCost();
		}
		return cost;
	}
}
