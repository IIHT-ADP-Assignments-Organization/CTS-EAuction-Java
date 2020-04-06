package com.Eauction.common;

public class EmailAlreadyExist extends Exception {
	
	public static  String message="Email already exists !..";


	public void EmailAlreadyExistException()
	{
		
	}
	public void EmailAlreadyExistException(String message)
	{
		this.message=message;
	}

}
