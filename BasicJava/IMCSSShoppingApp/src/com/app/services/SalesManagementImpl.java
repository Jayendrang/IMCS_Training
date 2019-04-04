package com.app.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.javatuples.Triplet;

import com.app.bean.Order;
import com.app.bean.Product;
import com.app.bean.UserInfo;
import com.app.dao.SalesManagement;

public class SalesManagementImpl implements SalesManagement {
	private static int orderNumber = 0;
	private static List<Triplet<String, String, Order>> salesInformation = new ArrayList();

	@Override
	public String placeOrder(UserInfo user, Order orders) {
		orderNumber++;
		orders.setOrderId(orders.getOrderId() + orderNumber);
		orders.setOrderStatus("NEW");
		salesInformation.add(new Triplet<String, String, Order>(orders.getOrderId(), user.getUserName(), orders));
		return orders.getOrderId();
	}

	@Override
	public boolean cancelOrder(String orders) {

		for (Triplet<String, String, Order> data : salesInformation) {
			if (data.getValue0().equals(orders)) {
				salesInformation.remove(
						new Triplet<String, String, Order>(data.getValue0(), data.getValue1(), data.getValue2()));

				return true;
			}
		}

		return false;
	}

	public void numberOfOrders() {
		System.out.println(salesInformation.size());
	}

	public static void main(String[] args) {

		SalesManagementImpl impl = new SalesManagementImpl();
		SalesManagementImpl impl1 = new SalesManagementImpl();
		SalesManagementImpl impl2 = new SalesManagementImpl();
		UserInfo user = new UserInfo("Jay", "Jay", "AR", "1234 5614 1234 1101");
		List<Product> products = new ArrayList() {
			{
				add(new Product("1001", "Bath Soap", "Cosmetics", "Non perishable", 0, 12.2d));
				add(new Product("1002", "Apple", "Fruits", "perishable", 0, 3.6d));
				add(new Product("1003", "Cucumber", "Veggie", "perishable", 0, 0.12d));
			}
		};
		Order order = new Order(products);
		Order order1 = new Order(products);
		Order order2 = new Order(products);
		
		
		System.out.println(impl.placeOrder(user, order));
		System.out.println(impl1.placeOrder(user, order1));
		System.out.println(impl2.placeOrder(user, order2));
		impl.cancelOrder("ORD1");
		impl.numberOfOrders();

	}
}
