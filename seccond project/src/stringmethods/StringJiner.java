package stringmethods;

import java.util.StringJoiner;

public class StringJiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner joinNames = new StringJoiner(",", "[", "]");   /* passing comma(,) and square-brackets as delimiter */  
		  // ----- Adding values to StringJoiner---  
		        joinNames.add("New York");  
		        joinNames.add("New Jersey");  
		  
		//----  Creating StringJoiner with :(colon) delimiter  
		    StringJoiner joinNames2 = new StringJoiner(":", "[", "]");  /* passing colon(:) and square-brackets as delimiter  */  
		 
		 // ---Adding values to StringJoiner-----  
		         joinNames2.add("Dallas");  
		        joinNames2.add("Chicago");  
		  // ---- Merging two StringJoiner  ----
		        StringJoiner merge = joinNames.merge(joinNames2);   
		        System.out.println(merge);  

	}

}
