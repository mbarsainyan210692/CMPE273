package com.shim.cmpe273.stack;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestDFS {

	@Test
	public void test() 
	{
		ArrayList<Node> nodes=new ArrayList<Node>();

		
		
		Node node1 =new Node(1); 
		Node node2 =new Node(2);
		Node node3 =new Node(3);
		Node node4 =new Node(4);
		Node node5 =new Node(5);
		Node node6 =new Node(6);
		Node node7 =new Node(7);
		Node node8 =new Node(8);
		
		nodes.add(node1);
		nodes.add(node2);
		nodes.add(node3); 
		nodes.add(node4);
		nodes.add(node5);
		nodes.add(node6); 
		nodes.add(node7);
		nodes.add(node8);
		int adjacencymatrix[][] = 
			{
					{0,1,0,0,1,0,0,0}, {1,0,1,0,0,0,0,0}, {0,1,0,1,0,1,0,0}, {0,0,1,0,0,0,0,1},
					{1,0,1,0,0,1,0,0},{0,0,1,0,1,0,1,0}, {0,0,0,0,0,1,0,1},{0,0,0,1,0,0,1,0}};
			
		
		DFSUsingStack dfsExample = new DFSUsingStack(nodes); 
		List<Node> visitednodes=dfsExample.depthFirstsearch(adjacencymatrix, node1); 
		for(Node n:visitednodes)
		{
//			System.out.println(n.data);
		}
		assertNotNull(visitednodes);
		assertTrue(visitednodes.containsAll(nodes));
	
	}

}
