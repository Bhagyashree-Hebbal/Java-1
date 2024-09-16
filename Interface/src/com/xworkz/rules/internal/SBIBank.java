package com.xworkz.rules.internal;

import com.xworkz.rules.media.BankRegulations;

public class SBIBank implements BankRegulations {
	public SBIBank() {
		super();
		System.out.println("no-arg const SBIBank");
	}

	@Override
	public boolean maintainQueue() {
		System.out.println("running maintainQueue");
		return true;
	}

	@Override
	public boolean provideValidID() {
		System.out.println("running provideValidID");
		return true;
	}

	@Override
	public boolean followBankTimings() {
		System.out.println("running followBankTimings");
		return true;
	}

	@Override
	public boolean avoidLoudConversations() {
		System.out.println("running avoidLoudConversations");
		return false;
	}

	@Override
	public boolean respectBankStaff() {
		System.out.println("running respectBankStaff");
		return true;
	}

	@Override
	public boolean avoidUsingMobilePhones() {
		System.out.println("running avoidUsingMobilePhones");
		return true;
	}

	@Override
	public boolean fillFormsCorrectly() {
		System.out.println("running fillFormsCorrectly");
		return true;
	}

	@Override
	public boolean avoidUnattendedBaggage() {
		System.out.println("running avoidUnattendedBaggage");
		return false;
	}

	@Override
	public boolean followSecurityProcedures() {
		System.out.println("running followSecurityProcedures");
		return true;
	}

	@Override
	public boolean useDesignatedCounters() {
		System.out.println("running useDesignatedCounters");
		return true;
	}

	@Override
	public boolean avoidOvercrowding() {
		System.out.println("running avoidOvercrowding");
		return true;
	}

	@Override
	public boolean followCashHandlingRules() {
		System.out.println("running followCashHandlingRules");
		return true;
	}

	@Override
	public boolean respectPrivacy() {
		System.out.println("running respectPrivacy");
		return true;
	}

	@Override
	public boolean avoidEatingInside() {
		System.out.println("running avoidEatingInside");
		return true;
	}

	@Override
	public boolean followCovidGuidelines() {
		System.out.println("running followCovidGuidelines");
		return true;
	}

	@Override
	public boolean useATMProperly() {
		System.out.println("running useATMProperly");
		return true;
	}

	@Override
	public boolean avoidFraudulentActivities() {
		System.out.println("running avoidFraudulentActivities");
		return true;
	}

	@Override
	public boolean reportSuspiciousBehavior() {
		System.out.println("running reportSuspiciousBehavior");
		return true;
	}

	@Override
	public boolean keepBankPremisesClean() {
		System.out.println("running keepBankPremisesClean");
		return true;
	}

	@Override
	public boolean followCustomerServiceProtocols() {
		System.out.println("running followCustomerServiceProtocols");
		return true;
	}

}
