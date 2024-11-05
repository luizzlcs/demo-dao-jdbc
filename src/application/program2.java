package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class program2 {

	public static void main(String[] args) {
DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department findById ===");
		Department department = departmentDao.findByid(2);
		
		System.out.println(department);

		System.out.println("\n=== TEST 2: Department findAll ===");
		
		List<Department> dep = departmentDao.findAll();
		
//		dep.forEach(System.out::print);
		for (Department list : dep) {
			System.out.println(list);
			
		}
		
//		System.out.println("\n=== TEST 3: Department Insert ===");
//		Department newDep = new Department(null, "Financial");
//		departmentDao.insert(newDep);
//		System.out.println("New Department created: " + newDep.getId() +" - " + newDep.getName());
		
		
		System.out.println("\n=== TEST 4: Department Insert ===");
		Department nowDep = departmentDao.findByid(7);
		nowDep.setName("Comunication");
		departmentDao.update(nowDep);
		System.out.println("Department UpdDate: " + nowDep.getId() +" - " + nowDep.getName());
		
		System.out.println("\n=== TEST 5: Department Delete ===");
		int deleteId = 15;
		Department findDep = departmentDao.findByid(deleteId);
		departmentDao.deletById(deleteId);
		System.out.println("Department Delete: " + findDep.getId() +" - " + findDep.getName());
	}

}
