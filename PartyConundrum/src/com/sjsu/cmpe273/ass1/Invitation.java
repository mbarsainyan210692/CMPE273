package com.sjsu.cmpe273.ass1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Invitation {
	public static void main(String[] args) {
		Manager m1 = new Manager("Joey", 10, 3);
		Manager m2 = new Manager("Ross", 7, 2);
		Manager m3 = new Manager("Rachel", 8, 1);
		Manager m4 = new Manager("Chandler", 9, 5);
		Manager m5 = new Manager("Monica", 6, 4);
		Manager m6 = new Manager("Phoebe", 8, 4);
		List<Manager> managers = new ArrayList<Manager>();
		managers.add(m1);
		managers.add(m2);
		managers.add(m3);
		managers.add(m4);
		managers.add(m5);
		managers.add(m6);
		Subordinates s1 = new Subordinates("Jess", 3, 12);
		Subordinates s2 = new Subordinates("Ron", 4, 9);
		Subordinates s3 = new Subordinates("Mitchel", 3, 7);
		Subordinates s4 = new Subordinates("Priya", 3, 10);
		Subordinates s5 = new Subordinates("Amy", 2, 6);
		Subordinates s6 = new Subordinates("Stuart", 1, 8);
		List<Subordinates> subordinates = new ArrayList<Subordinates>();
		subordinates.add(s1);
		subordinates.add(s2);
		subordinates.add(s3);
		subordinates.add(s4);
		subordinates.add(s5);
		subordinates.add(s6);
		List<Invitable> colleagueList = new ArrayList<Invitable>();
		colleagueList.addAll(managers);
		colleagueList.addAll(subordinates);
		
		InviteGuests.getInvitations(colleagueList);

	}

}
