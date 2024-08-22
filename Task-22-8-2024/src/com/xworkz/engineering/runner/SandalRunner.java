package com.xworkz.engineering.runner;

import com.xworkz.engineering.data.SandalData;
import com.xworkz.engineering.store.SandalStore;

public class SandalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SandalStore sandalStore = new SandalStore();
		sandalStore.display();

		SandalData sandalData1 = new SandalData("Bata", 'M', 500, "Black");
		sandalStore.save(sandalData1);
		sandalStore.display();

		SandalData sandalData2 = new SandalData("Crocs", 'L', 1000, "Grey");
		sandalStore.save(sandalData2);
		sandalStore.display();

		SandalData sandalData3 = new SandalData("Woodland", 's', 5000, "Brown");
		sandalStore.save(sandalData3);
		sandalStore.display();

		SandalData sandalData4 = new SandalData("Liberty", 'M', 800, "Pink");
		sandalStore.save(sandalData4);
		sandalStore.display();

		SandalData sandalData5 = new SandalData("Nike", 'X', 1000, "Black");
		sandalStore.save(sandalData5);
		sandalStore.display();
	}

}
