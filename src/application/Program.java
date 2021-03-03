package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "books");
		System.out.println(obj);
		
		Seller seller = new Seller(obj ,21, "bob", "bob@gmaiil.com", new Date(), 3000.0);
		System.out.println(seller);
	}

}
