package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		sellerDao.findById(4);
		
		System.out.println(sellerDao);
		
		DB.getConnection();
	}

}
