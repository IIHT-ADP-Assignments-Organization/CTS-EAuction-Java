package com.Eauction.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Eauction.dao.UserServiceDao;
import com.Eauction.models.Buyer;
import com.Eauction.models.Product;
import com.Eauction.models.User;


@Component
@Service ("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserServiceDao userServiceDao;
	@Transactional
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public List<Product> searchProduct(String categoryName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean bidProduct(int bidPrice, Buyer buyer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public List<Product> viewProductsPurchased(int buyerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<Product> viewProductsSold(int sellerId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
