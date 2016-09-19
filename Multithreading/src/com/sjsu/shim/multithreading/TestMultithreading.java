package com.sjsu.shim.multithreading;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestMultithreading {

	@Test
	public void test() throws InterruptedException {
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
		WaiterThread w1=new WaiterThread();
		Thread waiter1=new Thread(w1);
		waiter1.start();
	Thread.sleep(30000);
		Platform p= Platform.getInstance();
		assertTrue(p.getDishes().size()>0);
		assertTrue(w1.deliveredDishes.size()>0);
		
	}

}
