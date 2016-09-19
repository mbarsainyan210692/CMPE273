package com.sjsu.shim.multithreading;

public class Dish {
private String name="";
private int cost=0;

public Dish(String name) {
	this.name=name;
	this.cost=Globals.costByNameMap.get(name);
}

public int getCost() {
	return cost;
}

public void setCost(int cost) {
	this.cost = cost;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
@Override
public boolean equals(Object d)
{
	if(d instanceof Dish)
	{
		if(this.name.equals(((Dish) d).name))
		{
			return true;
		}
	}
	return false;
	}

}
