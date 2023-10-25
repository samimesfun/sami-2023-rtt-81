package org.perscholas.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class OrderProductsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1) Create a connection to the database classic_models
		// 2) Use the scanner to take input of an order number
		// 3) Write a query using a prepared statement to print out the product_id, product name, 
		//    quantity ordered, msrp, buy_price, margin (msrp-buy_price), and total margin (margin * quantity ordered)
		// try to make the output look nice
		
		// DOUBLE BONUS
		// 4) use a variable to calculate the total margin for the entire order (all products)
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "sa0799sa";
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // optional
			connection = DriverManager.getConnection(dburl, user, password);
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the order number : ");
				int orderId=scanner.nextInt();
			
		    String sql="select  p.id 'id' ,p.product_name 'product_name' ,p.msrp 'msrp',p.buy_price 'buy_price', (p.msrp-p.buy_price) 'margin', \r\n"
		    		+ "((p.msrp-p.buy_price)*od.quantity_ordered) 'total_margin'\r\n"
		    		+ "from products p, orderdetails od where od.product_id=p.id\r\n"
		    		+ "and od.order_id=?";
		    
		    //System.out.println(sql);
		    PreparedStatement stmt=connection.prepareStatement(sql);
		    stmt.setInt(1, orderId);
		    
		    ResultSet result=stmt.executeQuery();
			System.out.println("id\t" + "productName\t\t" +"msrp\t"+"buyPrice\t"+"margin\t"+ "totalMargin" );
			System.out.println("*************************************************************************");
		     double totalMarginOfEntireOrder=0;
		    while (result.next()) {
				Integer id = result.getInt("id");
				String productName = result.getString("product_name");
				Double msrp=result.getDouble("msrp");
				Double  buyPrice = result.getDouble("buy_price");
				Double  margin = result.getDouble("margin");
				Double  totalMargin = result.getDouble("total_margin");
				System.out.println(id +"\t"+ productName +"\t\t"+msrp+"\t"+ buyPrice+"\t"+ margin +"\t"+totalMargin );
		
				totalMarginOfEntireOrder=(double)totalMargin+totalMarginOfEntireOrder;
				
			}
		    System.out.println("\n Total Margin for the Entire Order :"+totalMarginOfEntireOrder);
			
		   // System.out.println("\n Total Margin for the Entire Order :"+Math.round(totalMarginOfEntireOrder));
		    
		    System.out.printf("\n Total Margin for the Entire Order : %.2f",totalMarginOfEntireOrder);
		    
		} catch (Exception e) {

		}
		
	}

}
