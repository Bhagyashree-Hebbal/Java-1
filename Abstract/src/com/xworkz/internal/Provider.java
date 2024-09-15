package com.xworkz.internal;

public abstract class Provider {
	private String name;
	private String ceoName;

	public Provider(String name, String ceoName) {
		super();
		this.name = name;
		this.ceoName = ceoName;
	}

	@Override
	public String toString() {
		return "Provider [name=" + name + ", ceoName=" + ceoName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in Provider");
		if (obj != null) {
			if (obj instanceof Provider) {
				Provider casted = (Provider) obj;
				if (this.name.equals(casted.name) && this.ceoName.equals(casted.ceoName)) {
					System.out.println("left side is equals to right side");
					return true;
				}
			} else {
				System.out.println("obj is not Provider");
			}
		} else {
			System.out.println("obj is null");
		}
		return false;
	}

	public abstract void service();
public void show()
{
}
}
