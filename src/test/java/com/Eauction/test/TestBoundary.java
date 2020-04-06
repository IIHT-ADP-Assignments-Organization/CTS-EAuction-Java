package com.Eauction.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.Eauction.models.Buyer;
import com.Eauction.models.Seller;
import com.Eauction.models.User;




public class TestBoundary {

	 @Test
	    public void testMobileNumberLength()
	    {
		Buyer buyer = new 	Buyer();
		Seller seller = new Seller();
	        		
	        long mobileNumberLength=10;
	        
	        assertEquals(mobileNumberLength,buyer.getMobileNo());
	        assertEquals(mobileNumberLength,seller.getMobileNo());
	    }
	 
	 @Test
	    public void testPinNoLength()
	    {
		 
		User user = new User();
		user.setPin(234553);
			int minChar=7;
			 boolean pinNoLength=(user.getPin()==minChar);
	       
	        assertEquals( pinNoLength,user.getPin());
	       
	    }
	 
	 @Test
	    public void testpasswordLength()
	    {
	       
	       User user = new User();
		   user.setUserName("john123");
		   user.setPassword("john12345678");
	      

	        int passwordLength=10;
	assertEquals(passwordLength,user.getPassword().length());

	    }
	 @Test
	    public void testEmailLength()
	    {
		 User user = new User();
			user.setUserName("john123");
			user.setFirstName("john");
			user.setLastName("kumar");
			user.setPassword("john12345678");
			user.setReEnterPassword("john12345678");
			user.setBuildingNoAndStreet("23 morgan street");
			user.setCity("benglore");
			user.setState("karnataka");
			user.setPin(534253);
			user.setEmail("john@gmail.com");
			user.setMobile(1234567891);
			user.setPaypalAccount("121213243434");
	        		
	        int emailLength=10;
	assertEquals(emailLength,user.getEmail().length());


	    }
	 
	 @Test
	    public void testAddressLength()
	    {
		 User user = new User();
			user.setUserName("john123");
			user.setFirstName("john");
			user.setLastName("kumar");
			user.setPassword("john12345678");
			user.setReEnterPassword("john12345678");
			user.setBuildingNoAndStreet("23 morgan street");
			user.setCity("benglore");
			user.setState("karnataka");
			user.setPin(534253);
			user.setEmail("john@gmail.com");
			user.setMobile(1234567891);
			user.setPaypalAccount("121213243434");
	        		
			int minChar=100;
	        boolean addressLength=(user.getBuildingNoAndStreet().length()<=minChar);
	        assertEquals( addressLength,user.getBuildingNoAndStreet());

	    }
}
