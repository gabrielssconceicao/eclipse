package app;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import models.dao.DAOFactory;
import models.dao.DepartmentDAO;
import models.dao.SellerDAO;
import models.entities.Department;
import models.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        DepartmentImplementation();
    }

    public static void SellerImplementation() {
        Scanner sc = new Scanner(System.in);
        SellerDAO sellerDAO = DAOFactory.createSellerDAO();

        System.out.println("\n=== TEST 1: seller findById ===\n");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ===\n");
        Department department = new Department(2, null);
        List<Seller> list = sellerDAO.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller findAll ===\n");
        list = sellerDAO.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 4: seller insert ===\n");
        Seller newSeller = new Seller(null, "Greg", "greg@email.com", new Date(),
                4000.0, department);
        sellerDAO.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n=== TEST 5: seller update ===\n");
        Seller altSeller = sellerDAO.findById(8);
        altSeller.setName("Martha Waine");
        altSeller.setEmail("martha@email.com");
        sellerDAO.update(altSeller);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 6: seller delete ===\n");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDAO.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
    }

    public static void DepartmentImplementation() {

        System.out.println("\n=== TEST 7: department findById ===\n");
        DepartmentDAO departmentDAO = DAOFactory.createDepartmentDAO();
        Department department = departmentDAO.findById(2);
        System.out.println(department);

        System.out.println("\n=== TEST 8: department findAll ===\n");
        List<Department> list = departmentDAO.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }
    }
}
