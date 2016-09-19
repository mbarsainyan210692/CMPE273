package com.sjsu.shim.multithreading;

public class Main {

	public static void main(String[] args) {
		Order o=new Order();
		o.addOrder("a", 3);
		Order o2=new Order();
		o2.addOrder("a", 1);
		o2.addOrder("b", 1);
		Order o3=new Order();
		o3.addOrder("a", 1);
		o3.addOrder("c", 4);
		Orders.addOrder(o);
		Orders.addOrder(o2);
		Orders.addOrder(o3);
		Thread chef=new Thread(new ChefThread());
		chef.start();
		Thread waiter1=new Thread(new WaiterThread());
		waiter1.start();
		
	}

}
