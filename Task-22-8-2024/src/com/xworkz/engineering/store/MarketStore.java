package com.xworkz.engineering.store;

import com.xworkz.engineering.data.MarketData;

public class MarketStore {
	private MarketData[] datas = new MarketData[5];
	private int index = 0;

	public void save(MarketData data) {
		System.out.println("Created a MarketData");
		this.datas[this.index] = data;
		this.index++;
	}

	public void display() {
		System.out.println("running display in store");
		for (MarketData data : this.datas) {
			if (data != null) {
				data.display();
			} else {
				System.out.println("Data is null");
			}
		}
	}
}
