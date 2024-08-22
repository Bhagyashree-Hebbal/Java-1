package com.xworkz.engineering.runner;

import com.xworkz.engineering.data.SideDishData;
import com.xworkz.engineering.store.SideDishStore;

public class SideDishRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SideDishStore sideDishStore = new SideDishStore();
		sideDishStore.display();

		SideDishData sideDishData1 = new SideDishData("Pizza", 500, "Spicy");
		sideDishStore.save(sideDishData1);
		sideDishStore.display();

		SideDishData sideDishData2 = new SideDishData("Pickle", 500, "spicy");
		sideDishStore.save(sideDishData2);
		sideDishStore.display();

		SideDishData sideDishData3 = new SideDishData("Chips", 500, "salty");
		sideDishStore.save(sideDishData3);
		sideDishStore.display();

		SideDishData sideDishData4 = new SideDishData("Ketchup", 500, "tamato");
		sideDishStore.save(sideDishData4);
		sideDishStore.display();

		SideDishData sideDishData5 = new SideDishData("Pea nut", 50, "Masala");
		sideDishStore.save(sideDishData5);
		sideDishStore.display();
	}

}
