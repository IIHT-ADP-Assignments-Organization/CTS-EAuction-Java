package com.Eauction.common;

public class HouseNoAndCityAlreadyExistException extends Exception{
	
	public static  String message="House no and City already exists !..";


	public HouseNoAndCityAlreadyExistException()
	{
		
	}
	public HouseNoAndCityAlreadyExistException(String message)
	{
		this.message=message;
	}
	

}
