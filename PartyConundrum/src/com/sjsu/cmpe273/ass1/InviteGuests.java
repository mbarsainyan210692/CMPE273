package com.sjsu.cmpe273.ass1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InviteGuests {

	public static List<Invitable> getInvitations(List<Invitable> colleagueList) {
		int intellact = 0;
		int humour = 0;
		List<Invitable> invitationList= new ArrayList<Invitable>() ;
		int counter=0;
		boolean complete=false;
		while(!(intellact == humour&& intellact>0))
		{
			invitationList= new ArrayList<Invitable>();
		Collections.shuffle(colleagueList);
		
		for (Invitable i : colleagueList) 
		{
			counter++;
			
			intellact = intellact + i.intellactIndex();
			humour = humour + i.humourIndex();
			invitationList.add(i);
			if (intellact == humour && counter==8) 
			{
				break;
			}
		
		}
		
		if (intellact == humour && counter<=8) 
		{
			Collections.shuffle(colleagueList);
			break;
		}
		counter=0;
		intellact = 0;
		humour = 0;
		
		}
		
		System.out.println("Invited people are :");
		for(Invitable i:invitationList)
		{
			System.out.println(i.getName());
		}
		System.out.println("intellact index of party :"+intellact+" humour index of party :"+humour);
		return invitationList;
	}
}
