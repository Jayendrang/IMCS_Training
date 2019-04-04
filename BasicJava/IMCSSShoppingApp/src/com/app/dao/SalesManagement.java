package com.app.dao;

import java.util.List;

import com.app.bean.Order;
import com.app.bean.UserInfo;

public interface SalesManagement {

	public String placeOrder(UserInfo user, Order orders);

	public boolean cancelOrder(String orderId);

}
