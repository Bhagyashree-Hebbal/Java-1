package com.xworkz.engineering;

public class Submarine {
		
		private String name;
		private String country;
		private String shape;
		private String property="AttackSubmarines";
		private double size;
		private int inventedyear=1800;
		private String inventername="Cornelis Drebbel";
		private double capacity=20000;
		private int speed=24;
		private String fastestsubmarine="GoldenFish";
	    private String strongestSubmarine="Ohio SSBN";
		private int temp;
		private int depth;
		private int c;
		private int cargoCapacity;
		private int crewSize;
		private String submarineType;
		private double fuelLevel;
		private boolean isNuclearPowered;
		private String captainName;
		private int yearOfCommission;
		private String hullMaterial;
		private double length;
		private double width;
		private double height;
		private int noOfTorpedoes;
		private int noOfMissiles;
		private String homePort;
		private String Equipment;
		private boolean isActive;
		private double currentLatitude;
		private double currentLongitude;
		private int operatingRange;
		private String communicationSystem;
		private boolean hasSonar;
		private boolean hasRadar;
		private boolean isUnderMaintenance;
		private String missionType;
		private int noOfRescueDrones;
		private String safetyEquipment;
		    
		   public  Submarine(String name,String country,String shape,String property,double size)
		    
		   {
			   this.name=name;
			   this.country=country;
			   this.shape=shape;
			   this.property=property;
			   this.size=size;
		   }
	public void calculate()
	{
		System.out.println("name:"+ this.name);
		System.out.println("country:"+ this.country);
		System.out.println("shape:"+ this.shape);
		System.out.println("property:"+ this.property);
		System.out.println("size:"+ this.size);
		System.out.println("name:"+ this.inventedyear);
		System.out.println("capacity:"+ this.capacity);
		System.out.println("fastestsubmarine:"+ this.fastestsubmarine);
		System.out.println("strongestSubmarine:"+ this.strongestSubmarine);
		System.out.println("temp:"+ this.temp);
		System.out.println("speed:"+ this.speed);
		System.out.println("currentLatitude:"+ this.currentLatitude);
		System.out.println("currentLongitude:"+ this.currentLongitude);
		System.out.println("operatingRange:"+ this.operatingRange);
		System.out.println("communicationSystem:"+ this.communicationSystem);
		System.out.println(" hasSonar:"+ this. hasSonar);
		System.out.println("hasRadar:"+ this.hasRadar);
		System.out.println("isUnderMaintenance:"+ this.isUnderMaintenance);
		System.out.println("missionType:"+ this.missionType);
		System.out.println("noOfRescueDrones:"+ this.noOfRescueDrones);
		System.out.println("safetyEquipment:"+ this.safetyEquipment);
		System.out.println("yearOfCommission:"+ this.yearOfCommission);
		System.out.println("hullMaterial:"+ this.hullMaterial);
		System.out.println("length:"+ this.length);
		System.out.println("width:"+ this.width);
		System.out.println("height:"+ this.height);
		System.out.println("noOfTorpedoes:"+ this.noOfTorpedoes);
		System.out.println("noOfMissiles:"+ this.noOfMissiles);
		System.out.println("homePort:"+ this.homePort);
		System.out.println(" Equipment:"+ this. Equipment);
		System.out.println("isActive:"+ this.isActive);
		
	}
		
	}