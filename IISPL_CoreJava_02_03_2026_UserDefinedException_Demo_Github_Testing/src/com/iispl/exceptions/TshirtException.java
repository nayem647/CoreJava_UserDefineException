package com.iispl.exceptions;

public class TshirtException extends RuntimeException {
	
	public String getMessage() {
		return "T-shirt Exception because material is not cotton!";
	}
}
