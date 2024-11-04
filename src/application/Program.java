package application;
import java.time.format.DateTimeFormatter;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Seller findById ===");
		Seller seller = sellerDao.findByid(1);
		
		System.out.println(seller);

		System.out.println("\n=== TEST 2: Seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
//		list.forEach(System.out::print);
		for (Seller obj : list) {
			System.out.println(obj);
			
		}
		System.out.println("\n=== TEST 3: Seller findAll ===");
		list = sellerDao.findAll();
		
//		list.forEach(System.out::print)	
		for (Seller obj : list) {
			System.out.println(obj);
			
		}
	}

}
