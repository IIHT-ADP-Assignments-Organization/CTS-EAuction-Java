package com.Eauction.services;

import java.util.List;

import com.Eauction.models.Buyer;
import com.Eauction.models.Product;
import com.Eauction.models.User;

public interface UserService {
	
	boolean register(User user);
	boolean login(String userName,String password);
	List<Product> searchProduct(String categoryName);
	boolean bidProduct(int bidPrice,Buyer buyer);
	List<Product> viewProductsPurchased(int buyerId);
	List<Product> viewProductsSold(int sellerId);
	

}
