package com.sjsu.shim.generics;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TestPetMarket {

	@Test
	public void test() {
		PetStore p=new PetStore("Susan");
		p.addPet(new Dog("Labrador"));
		p.addPet(new Cat("white"));
		p.addPet(new Cat("brown"));
		p.addPet(new Dog("pomelian"));
		p.addPet(new Dog("Husky"));
		
		PetStore<Dog> p1=new PetStore<Dog>("bill");
		p1.addPet(new Dog("Golden Retriever"));
		p1.addPet(new Dog("Pug"));
		p1.addPet(new Dog("Husky"));
		
		PetStore<Cat> p3=new PetStore<Cat>("Alan");
		p3.addPet(new Cat("golden"));
		p3.addPet(new Cat("black"));

		
		PetMarket pm=new PetMarket();
		pm.addPetStore(p);
		pm.addPetStore(p1);
		pm.addPetStore(p3);
		pm.displayPetStores();
		List<PetStore> ps=pm.getStores();
		assertEquals(5, ps.get(0).countPets());
		assertEquals(3, ps.get(1).countPets());
		assertEquals(2, ps.get(2).countPets());}

}
