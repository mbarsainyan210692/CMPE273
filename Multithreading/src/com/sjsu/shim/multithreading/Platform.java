package com.sjsu.shim.multithreading;

import java.util.ArrayList;
import java.util.List;

public class Platform {
private static List<Dish> dishesReady=new ArrayList<Dish>();
static Platform p=new Platform();
private Platform()
{
	
}
public static Platform getInstance()
{
	return p;
	}
public void addDish(Dish dish)
{
	dishesReady.add(dish);
}
public Dish getDish(Dish name)
{
	if(dishesReady.contains(name))
	{
		return dishesReady.remove(dishesReady.indexOf(name));
	}
	else
	{
		return null;
	}
}
public List<Dish> getDishes()
{
	return dishesReady;
}
}
