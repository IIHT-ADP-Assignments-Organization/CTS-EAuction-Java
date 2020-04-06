package com.Eauction.common;

public class MobileNoAlreadyExist extends Exception {
	
	public static  String message="Mobile No already exists !..";


	public void MobileNoAlreadyExistException()
	{
		
	}
	public void MobileNoAlreadyExistException(String message)
	{
		this.message=message;
	}


}
