package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department depto = new Department(1, "Books");
		
		Seller seller = new Seller (10, "Cesar", "cesar.f.silva@gmail.com", new Date(), 3000.0, depto );
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(depto);
		System.out.println(seller);
	}

}
