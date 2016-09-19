package com.sjsu.shim.multithreading;

import java.util.LinkedList;
import java.util.List;

public class Orders 
{
	private static List<Order> orders=new LinkedList<Order>();
	public static void addOrder(Order o)
	{
		orders.add(o);
		
	}
	public static Order getOrder() throws InterruptedException
	{
		if(orders.isEmpty())
		{
			Thread.sleep(60000);
			System.out.println("no orders at this time !");
			return null;
		}
		return orders.remove(0);
	}
}
