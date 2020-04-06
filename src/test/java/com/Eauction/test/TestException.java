package com.Eauction.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Eauction.common.EmailAlreadyExist;
import com.Eauction.common.HouseNoAndCityAlreadyExistException;
import com.Eauction.common.MobileNoAlreadyExist;
import com.Eauction.common.ProductDoesNotExist;
import com.Eauction.models.Category;
import com.Eauction.models.Product;
import com.Eauction.models.User;
import com.Eauction.services.UserService;


import junit.framework.Assert;

public class TestException {
	
	@Test
	 public void testForEmailAlreadyExist() throws EmailAlreadyExist
  
   {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
	
	 User user = new User();
		
		
	 UserService userservice=(UserService) context.getBean("userService");
	
	 userservice.register(user);
	 
Assert.assertEquals(EmailAlreadyExist.message," email already exists !");
   }

	@Test
	 public void testForHouseNoAndCityAlreadyExist() throws HouseNoAndCityAlreadyExistException
  {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
	
	 User user = new User();
		
		
		
	 UserService userservice=(UserService) context.getBean("userService");
	 userservice.register(user);
	 
Assert.assertEquals(HouseNoAndCityAlreadyExistException.message," HouseNoAndCity already exists !");
  }
	@Test
	 public void testForMobileNoAlreadyExist() throws MobileNoAlreadyExist
{
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
	
	 User user = new User();
		
		
	 UserService userservice=(UserService) context.getBean("userService");
	 userservice.register(user);
	 
	 
Assert.assertEquals(MobileNoAlreadyExist.message," email already exists !");
}
	
	@Test
	 public void testForProductDoesNotExist() throws ProductDoesNotExist
{
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
	
	Product product = new Product();
	Category category = new Category();	
		
	 UserService userservice=(UserService) context.getBean("userService");
	 List<Product> productfromdb = userservice.searchProduct(category.getCategoryName());
	 	 
Assert.assertEquals(ProductDoesNotExist.message," Product Does not exists !");
}
	
}
