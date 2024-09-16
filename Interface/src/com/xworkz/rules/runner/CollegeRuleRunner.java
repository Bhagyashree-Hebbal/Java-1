package com.xworkz.rules.runner;

import com.xworkz.rules.internal.MangementRule;

public class CollegeRuleRunner {

	public static void main(String[] args) {
		MangementRule collegeRule = new MangementRule();

		collegeRule.attendClasses();
		collegeRule.submitAssignments();
		collegeRule.followDressCode();
		collegeRule.maintainDiscipline();
		collegeRule.participateInEvents();
		collegeRule.respectFaculty();
		collegeRule.useLibraryResources();
		collegeRule.followTimetable();
		collegeRule.avoidPlagiarism();
		collegeRule.maintainCleanliness();

		collegeRule.noOfStudents();
		collegeRule.noOfSubjects();

	}

}