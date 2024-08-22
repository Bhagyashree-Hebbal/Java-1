package com.xworkz.engineering.store;

import com.xworkz.engineering.data.SideDishData;

public class SideDishStore {
	private SideDishData[] datas = new SideDishData[5];
	private int index = 0;

	public void save(SideDishData data) {
		System.out.println("Created a SideDishData");
		this.datas[this.index] = data;
		this.index++;
	}

	public void display() {
		System.out.println("running display in store");
		for (SideDishData data : this.datas) {
			if (data != null) {
				data.display();
			} else {
				System.out.println("Data is null");
			}
		}
	}
}
