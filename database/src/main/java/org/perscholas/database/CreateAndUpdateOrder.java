package org.perscholas.database;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.dao.ProductDAO;
import org.perscholas.database.entity.Order;

public class CreateAndUpdateOrder {

	private OrderDAO orderDAO = new OrderDAO();
	private ProductDAO productDAO = new ProductDAO();

	public void insertOrder() throws ParseException {

		// makes a new date object that represents right now
		
		Order o = new Order();
		Date orderDate = new Date();
		o.setOrderDate(orderDate);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date requiredDate = sdf.parse("2023-10-31 12:30");

		o.setCustomerId(145);
		o.setComments("shipping in progress ");
		o.setOrderDate(orderDate);
		o.setShippedDate(null);
		o.setStatus("in process");
		o.setRequiredDate(requiredDate);

		orderDAO.save(o);

	}

	public void ListQuery() {
		List<Order> order = orderDAO.findByCustomerId(10100);
		System.out.println("we found" + order.size() + "record in database");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateAndUpdateOrder insert= new CreateAndUpdateOrder();
		
		insert.ListQuery();
		try {
			insert.insertOrder();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*Scannar scan=new Scanner(System.in);
		System.out.println("Enter the ");*/
	}
}