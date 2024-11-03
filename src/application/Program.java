package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Bocks");
		Seller seller = new Seller(1,"Luiz", "luizzlcs@gmail.com",  LocalDate.parse("20/02/1984", dtf), 1200.00, obj); 
		
		System.out.println(seller);

	}

}
