package com.xworkz.inheritancetypes.runner;

import com.xworkz.inheritancetypes.internal.TeamLead;

//Multilevel inheritance
public class EmployeeRunner {

	public static void main(String[] args) {
		TeamLead teamLead = new TeamLead();
		teamLead.name = "Alice";
		teamLead.employeeID = 123;
		teamLead.department = "IT";
		teamLead.teamSize = 10;

		teamLead.work();
		teamLead.manageTeam();
		teamLead.leadTeam();

	}

}
