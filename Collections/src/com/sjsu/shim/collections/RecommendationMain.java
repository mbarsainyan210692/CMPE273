package com.sjsu.shim.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecommendationMain {
	public static void main(String [] args)
	{
		Map<Integer, List<Book>> soldBooks=new HashMap<Integer, List<Book>>();
		List<Book> sb1= new ArrayList<Book>();
		sb1.add(new Book("a","b"));
		sb1.add(new Book("a1","b1"));
		sb1.add(new Book("a2","b2"));
		sb1.add(new Book("a3","b3"));
		sb1.add(new Book("a4","b4"));
		List<Book> sb2= new ArrayList<Book>();
		sb2.add(new Book("a5","b5"));
		sb2.add(new Book("a6","b6"));
		List<Book> sb3= new ArrayList<Book>();
		sb3.add(new Book("a7","b7"));
		sb3.add(new Book("a8","b8"));
		sb3.add(new Book("a9","b9"));
		soldBooks.put(1, sb1);
		soldBooks.put(2, sb2);
		soldBooks.put(5, sb3);
		
		Map<Integer, List<Book>> viewedBooks=new HashMap<Integer, List<Book>>();
		List<Book> vb1= new ArrayList<Book>();
		vb1.add(new Book("c","d"));
		vb1.add(new Book("c1","d1"));
		vb1.add(new Book("c2","d2"));
		vb1.add(new Book("c3","d3"));
		vb1.add(new Book("c4","d4"));
		List<Book> vb2= new ArrayList<Book>();
		vb2.add(new Book("c5","d5"));
		vb2.add(new Book("c6","d6"));
		List<Book> vb3= new ArrayList<Book>();
		vb3.add(new Book("c7","d7"));
		vb3.add(new Book("c8","d8"));
		vb3.add(new Book("c9","d9"));
		viewedBooks.put(10, vb1);
		viewedBooks.put(15, vb2);
		viewedBooks.put(20, vb3);
		
		Map<Integer, List<Book>> wishlistedBooks=new HashMap<Integer, List<Book>>();
		List<Book> wl1= new ArrayList<Book>();
		wl1.add(new Book("e","f"));
		wl1.add(new Book("e1","f1"));
		wl1.add(new Book("e2","f2"));
		wl1.add(new Book("e3","f3"));
		wl1.add(new Book("e4","f4"));
		List<Book> wl2= new ArrayList<Book>();
		wl2.add(new Book("e5","f5"));
		wl2.add(new Book("e6","f6"));
		List<Book> wl3= new ArrayList<Book>();
		wl3.add(new Book("e7","f7"));
		wl3.add(new Book("e8","f8"));
		wl3.add(new Book("e9","f9"));
		wishlistedBooks.put(22, wl1);
		wishlistedBooks.put(31, wl2);
		wishlistedBooks.put(20, wl3);
		
		GenerateRecommendation recom=new GenerateRecommendation();
		recom.recommend(soldBooks, viewedBooks, wishlistedBooks);
		
	}
}
