package com.xworkz.rules.internal;

import com.xworkz.rules.media.TeacherRule;

public class MangementRule implements TeacherRule {
	public MangementRule() {
		super();
		System.out.println("no-arg const MangementRule");
	}

	@Override
	public boolean attendClasses() {
		System.out.println("running attendClasses");
		return true;
	}

	@Override
	public boolean submitAssignments() {
		System.out.println("running submitAssignments");
		return true;
	}

	@Override
	public boolean followDressCode() {
		System.out.println("running followDressCode");
		return true;
	}

	@Override
	public boolean maintainDiscipline() {
		System.out.println("running maintainDiscipline");
		return true;
	}

	@Override
	public boolean participateInEvents() {
		System.out.println("running participateInEvents");
		return true;
	}

	@Override
	public boolean respectFaculty() {
		System.out.println("running respectFaculty");
		return true;
	}

	@Override
	public boolean useLibraryResources() {
		System.out.println("running useLibraryResources");
		return true;
	}

	@Override
	public boolean followTimetable() {
		System.out.println("running followTimetable");
		return true;
	}

	@Override
	public boolean avoidPlagiarism() {
		System.out.println("running avoidPlagiarism");
		return false;
	}

	@Override
	public boolean maintainCleanliness() {
		System.out.println("running maintainCleanliness");
		return true;
	}

	@Override
	public int noOfStudents() {
		System.out.println("running noOfStudents");
		return 100;
	}

	@Override
	public int noOfSubjects() {
		System.out.println("running noOfSubjects");
		return 10;
	}

}
