package application;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");

		Seller seller = new Seller(21, "Bob", "bob@gmail.com",
				Date.valueOf(LocalDate.parse("22/05/1985", DateTimeFormatter.ofPattern("dd/MM/yyyy"))), 3000.0, obj);
		
		System.out.println(seller);
	}

}
