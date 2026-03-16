package com.iispl.entity;

import com.iispl.exceptions.TshirtException;

public class Tshirt extends Fabric{
	public Tshirt(String fabricType) {
		super(fabricType);
	}
	
	public void washTshirt(Fabric fabric) throws TshirtException {
		if(fabric.getFabricType() == "Cotton") {
			System.out.println("Washing T-shirt");
		}else {
			throw new TshirtException();
		}
	}
}
