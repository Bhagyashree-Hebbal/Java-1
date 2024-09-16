package com.xworkz.rules.runner;

import com.xworkz.rules.internal.SBIBank;

public class BankRuleRunner {

	public static void main(String[] args) {
		SBIBank bankRule = new SBIBank();

		bankRule.maintainQueue();
		bankRule.provideValidID();
		bankRule.followBankTimings();
		bankRule.avoidLoudConversations();
		bankRule.respectBankStaff();
		bankRule.avoidUsingMobilePhones();
		bankRule.fillFormsCorrectly();
		bankRule.avoidUnattendedBaggage();
		bankRule.followSecurityProcedures();
		bankRule.useDesignatedCounters();
		bankRule.avoidOvercrowding();
		bankRule.followCashHandlingRules();
		bankRule.respectPrivacy();
		bankRule.avoidEatingInside();
		bankRule.followCovidGuidelines();

		bankRule.useATMProperly();
		bankRule.avoidFraudulentActivities();
		bankRule.reportSuspiciousBehavior();
		bankRule.keepBankPremisesClean();
		bankRule.followCustomerServiceProtocols();

	}

}
