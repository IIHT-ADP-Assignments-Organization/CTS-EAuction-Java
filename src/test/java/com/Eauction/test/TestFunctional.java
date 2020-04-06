package com.Eauction.test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertSame;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Eauction.models.Buyer;
import com.Eauction.models.Category;
import com.Eauction.models.Product;
import com.Eauction.models.Seller;
import com.Eauction.models.Transaction;
import com.Eauction.models.User;
import com.Eauction.services.UserService;




public class TestFunctional {
	
	@Test
	public void testRegister()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");
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
				
	   UserService userservice=(UserService) context.getBean("userService");
	   userservice.register(user);
		boolean userfromdb =userservice.register(user);
		assertSame(user,userfromdb);
	}

	@Test
	public void testLogin()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");
		User user = new User();
		user.setUserName("john123");
		user.setPassword("john12345678");
		   UserService userservice=(UserService) context.getBean("userService");
		boolean userfromdb = userservice.login(user.getUserName(),user.getPassword());
		assertSame(true,userfromdb);
	}

	@Test

	public void testSearchProducts() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");	
		Category category = new Category();
		category.setCategoryId(1);
		category.setCategoryName("electronics");
		
		  UserService userservice=(UserService) context.getBean("userService");
		List<Product> productfromdb = userservice.searchProduct(category.getCategoryName());
		Assert.assertNotNull(productfromdb);
	}

	@Test
	public void testBidProduct()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");
		
		Buyer buyer = new Buyer();
		Transaction transaction = new Transaction();
		
		buyer.setBuyerId(1);
		buyer.setBuyerName("Joseph");
		buyer.setAddress("benglore");
		buyer.setEmail("joseph@gmail.com");
		buyer.setMobileNo(1234567885);
		transaction.setBidAmount(2500);
		
		   UserService userservice=(UserService) context.getBean("userService");
		boolean bidProduct = userservice.bidProduct(transaction.getBidAmount(),buyer);
		assertSame(true,bidProduct);
	}
	
	@Test
	public void testViewMyProfile() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
		
		Buyer buyer = new Buyer();
		
		buyer.setBuyerId(1);
		 UserService userservice=(UserService) context.getBean("userService");
		 List<Product> productfromdb =userservice.viewProductsPurchased(buyer.getBuyerId());
		assertEquals("1",productfromdb);
		
	}
	
	@Test
	public void testViewProductsSold() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
		Seller seller = new Seller(); 
		
		seller.setSellerId(1);
		 UserService userservice=(UserService) context.getBean("userService");
		 List<Product> productfromdb =userservice.viewProductsPurchased(seller.getSellerId());
		assertEquals("1",productfromdb);
		
	}
	
	
	
}
