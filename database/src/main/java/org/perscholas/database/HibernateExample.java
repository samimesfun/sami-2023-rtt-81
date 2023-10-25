package org.perscholas.database;

import java.util.List;

import org.perscholas.database.dao.CustomerDAO;
import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.dao.OrderDetailDAO;
import org.perscholas.database.dao.ProductDAO;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.OrderDetail;
import org.perscholas.database.entity.Product;

public class HibernateExample {

	public static void main(String[] args) {
		/*
		 * CustomerDAO customerDao = new CustomerDAO();
		 * 
		 * Customer customer = customerDao.findById(103);
		 * 
		 * System.out.println(customer.getId() + " | " + customer.getCustomerName());
		 * 
		 * 
		 * List<Customer> customers = customerDao.findByFirstName("Leslie"); for (
		 * Customer c : customers ) { System.out.println(c.getId() + " | " +
		 * c.getCustomerName() + " | " + c.getContactFirstname() + " | " +
		 * c.getContactLastname()); }
		 */

		// This one is the output for Orders table

		/*
		 * OrderDAO orderDao = new OrderDAO();
		 * 
		 * Order order = orderDao.findById(10100);
		 * 
		 * System.out.println(order.getId() + " | " + order.getCustomerId());
		 */

		// This one is for the products table

		/*
		 * ProductDAO productDao = new ProductDAO();
		 * 
		 * Product product = productDao.findById(1);
		 * 
		 * System.out.println(product.getId() + " | " + product.getProductName());
		 */

		// This one is for the orderdetails table
		OrderDetailDAO orderdetailDao = new OrderDetailDAO();

		OrderDetail orderdetail = orderdetailDao.findById(1);

		System.out.println(orderdetail.getId() + " | " + orderdetail.getOrderId());

	}

}