package com.xworkz.rules.internal;

import com.xworkz.rules.media.TempleRegulations;

public class TempleProtection implements TempleRegulations {

	public TempleProtection() {
		super();
		System.out.println("no-arg const TempleProtection");
	}

	@Override
	public boolean removeFootwear() {
		System.out.println("running removeFootwear");
		return true;
	}

	@Override
	public boolean maintainSilence() {
		System.out.println("running maintainSilence");
		return true;
	}

	@Override
	public boolean followQueue() {
		System.out.println("running followQueue");
		return true;
	}

	@Override
	public boolean traditionalDress() {
		System.out.println("running traditionalDress");
		return true;
	}

	@Override
	public boolean avoidPhotography() {
		System.out.println("running avoidPhotography");
		return true;
	}

	@Override
	public boolean respectRituals() {
		System.out.println("running respectRituals");
		return true;
	}

	@Override
	public boolean avoidLittering() {
		System.out.println("running avoidLittering");
		return false;
	}

	@Override
	public boolean donateGenerously() {
		System.out.println("running donateGenerously");
		return false;
	}

	@Override
	public boolean avoidTouchingIdols() {
		System.out.println("running avoidTouchingIdols");
		return true;
	}

	@Override
	public boolean followTempleTimings() {
		System.out.println("running followTempleTimings");
		return true;
	}

	@Override
	public String godNames() {
		System.out.println("running godNames");
		return "Ganesh";
	}

	@Override
	public boolean prayToGod() {
		System.out.println("running prayToGod");
		return true;
	}

}
