package com.iispl.entity;

import com.iispl.exceptions.TshirtException;

public class Fabric {
	String fabricType;

	public String getFabricType() {
		return fabricType;
	}

	public void setFabricType(String fabricType) {
		this.fabricType = fabricType;
	}

	public Fabric(String fabricType) {
		super();
		this.fabricType = fabricType;
	}
	
	public void washTshirt(Fabric fabric) throws TshirtException{
		
	}
	
}
