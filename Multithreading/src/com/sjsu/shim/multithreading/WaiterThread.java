package com.sjsu.shim.multithreading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WaiterThread  implements Runnable
{
	Platform p= Platform.getInstance();
	List<String> dishes=new LinkedList<String>();
	List<Dish> deliveredDishes= new ArrayList<Dish>();
	@Override
	public void run()
	{
		
		while(1==1)
		{
			Order o=null;
			try {
				o = Orders.getOrder();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(o==null)
			{
				continue;
			}
			Map<Dish,Integer> orderedDishes=o.getOrderedDishes();
			
			for(Dish d:orderedDishes.keySet())
			{
				while(orderedDishes.get(d)!=0)
				{
					if(p.getDish(d)!=null)
					{
						int quantity=orderedDishes.get(d);
						orderedDishes.put(d, quantity-1);
						System.out.println("One "+d.getName()+" delivered");
						deliveredDishes.add(d);
						try {
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else
					{
						try {
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				
			}
			
			System.out.println("order Completed. Have a nice meal");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
