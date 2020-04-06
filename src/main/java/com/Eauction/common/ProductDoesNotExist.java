package com.Eauction.common;

public class ProductDoesNotExist extends Exception {
	
	public static  String message="Product does not exist";


	public ProductDoesNotExist()
	{
		
	}
	public ProductDoesNotExist(String message)
	{
		this.message=message;
	}


}
