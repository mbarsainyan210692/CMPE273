package com.sjsu.shim.collections;

import java.util.*;

public class GenerateRecommendation {
public List<Book> recommend(Map<Integer,List<Book>> booksSold,Map<Integer,List<Book>> booksViewed,Map<Integer,List<Book>> booksWishListed)
{
	Map<Integer,List<Book>>	sortedBooksSold= new TreeMap<Integer,List<Book>>(new IntegerComparator());
	sortedBooksSold.putAll(booksSold);
	Map<Integer,List<Book>>	sortedBooksViewed= new TreeMap<Integer,List<Book>>(new IntegerComparator());
	sortedBooksViewed.putAll(booksViewed);
	Map<Integer,List<Book>>	sortedBooksWishListed= new TreeMap<Integer,List<Book>>(new IntegerComparator());
	sortedBooksWishListed.putAll(booksWishListed);
	
	List<Book> recommendedBooks=new ArrayList<Book>();
	getRecommendedBooks(sortedBooksSold, recommendedBooks);
	getRecommendedBooks(sortedBooksViewed, recommendedBooks);
	getRecommendedBooks(sortedBooksWishListed, recommendedBooks);
	System.out.println("Recommended books are:");
	for(Book b:recommendedBooks)
	{
		System.out.println("Title : "+b.getTitle()+" Autor : "+b.getAuthor());
	}
	return recommendedBooks;
}

private void getRecommendedBooks(Map<Integer, List<Book>> sortedBooksSold, List<Book> recommendedBooks) {
	Iterator<Integer> i=sortedBooksSold.keySet().iterator();
	while(i.hasNext())
	{
		
		List<Book> books=sortedBooksSold.get(i.next());
		Collections.shuffle(books);
		for(Book b:books)
		{
			recommendedBooks.add(b);
			if(recommendedBooks.size()%3==0)
			{
				break;
			}
		}
		if(recommendedBooks.size()%3==0)
		{
			break;
		}
	}
}
}
