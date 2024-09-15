package com.xworkz.inheritancetypes.internal;

//Multilevel inheritance
public class TeamLead extends Manager {
	public int teamSize;

	public void leadTeam() {
		System.out.println(name + " is leading a team of " + teamSize + " people.");
	}
}
