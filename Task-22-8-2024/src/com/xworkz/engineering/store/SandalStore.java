package com.xworkz.engineering.store;

import com.xworkz.engineering.data.SandalData;

public class SandalStore {
	private SandalData[] datas = new SandalData[5];
	private int index = 0;

	public void save(SandalData data) {
		System.out.println("Created a SandalData");
		this.datas[this.index] = data;
		this.index++;
	}

	public void display() {
		System.out.println("running display in store");
		for (SandalData data : this.datas) {
			if (data != null) {
				data.display();
			} else {
				System.out.println("Data is null");
			}
		}
	}
}
