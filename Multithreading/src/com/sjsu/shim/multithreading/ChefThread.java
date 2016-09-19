package com.sjsu.shim.multithreading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ChefThread implements Runnable
{
	Platform p= Platform.getInstance();
	List<String> dishes=new LinkedList<String>();
	
	@Override
	public void run()
	{
		dishes.addAll(Globals.costByNameMap.keySet());
				
		while(1==1)
		{
			for(int i=0;i<dishes.size();i++)
			{
				Dish dish= new Dish(dishes.get(i));
				p.addDish(dish);
				try {
					Thread.sleep(10*1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		}
		
	}
	
}
