package application;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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
		System.out.println("\n=== TEST 4: Seller findAll ===");
		list = sellerDao.findAll();
		
//		list.forEach(System.out::print)	
		for (Seller obj : list) {
			System.out.println(obj);
			
		}
		
		
		System.out.println("\n=== TEST 4: seller insert =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: seller Update =====");
		Seller find = sellerDao.findByid(1);
		find.setName("Maria");
		find.setBaseSalary(4890.45);
		sellerDao.update(find);
		System.out.println("Inserted! New id = " + find.getId());
		
		
		
	}

}
