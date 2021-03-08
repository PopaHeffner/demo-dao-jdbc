package application;

import java.util.Date;
import java.util.List;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println();

		System.out.println("=== TEST 2: seller findByDepartment ===");
		List<Seller> list = sellerDao.findByDepartment(new Department(2, null));

		list.stream().forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("=== TEST 3: seller findByAll ===");
		list = sellerDao.findAll();

		list.stream().forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("=== TEST 4: seller Insert ===");
		Seller insertSeller = new Seller(new Department(2, null), null, "Greg", "greg@gmail", new Date(), 4000.0);
		sellerDao.insert(insertSeller);
		System.out.println("Inserted! New id = "+ insertSeller.getId());
		
		System.out.println();
		
		System.out.println("=== TEST 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setNome("Martha Waine");
		sellerDao.insert(seller);
		System.out.println("Update completed");

		DB.closeConnection();
	}

}
