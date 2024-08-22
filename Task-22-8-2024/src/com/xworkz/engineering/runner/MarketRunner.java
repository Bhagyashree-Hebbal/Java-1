package com.xworkz.engineering.runner;

import com.xworkz.engineering.data.MarketData;
import com.xworkz.engineering.store.MarketStore;

public class MarketRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarketStore marketStore = new MarketStore();
		marketStore.display();

		MarketData marketData1 = new MarketData("Super market", "Kalburagi");
		marketStore.save(marketData1);
		marketStore.display();

		MarketData marketData2 = new MarketData("D Mart", "Bangalore");
		marketStore.save(marketData2);
		marketStore.display();

		MarketData marketData3 = new MarketData("Vegetable market", "Hyderbad");
		marketStore.save(marketData3);
		marketStore.display();

		MarketData marketData4 = new MarketData("MR mart", "Mysore");
		marketStore.save(marketData4);
		marketStore.display();

		MarketData marketData5 = new MarketData("Super market", "Mumbai");
		marketStore.save(marketData5);
		marketStore.display();

	}

}
