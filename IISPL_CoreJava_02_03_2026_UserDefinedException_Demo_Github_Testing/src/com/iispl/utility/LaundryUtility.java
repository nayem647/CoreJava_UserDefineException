package com.iispl.utility;

import com.iispl.entity.Fabric;
import com.iispl.entity.Tshirt;
import com.iispl.exceptions.TshirtException;

public class LaundryUtility {

	public static void main(String[] args) {
		
		Fabric fabric = new Tshirt("Slik");
		
		try {
			fabric.washTshirt(fabric);
		}catch(TshirtException e) {
			System.out.println(e.getMessage());
		}
	}

}
