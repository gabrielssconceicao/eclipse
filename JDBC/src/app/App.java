package app;

import java.util.List;

import models.dao.DAOFactory;
import models.dao.SellerDAO;
import models.entities.Department;
import models.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {

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
    }
}
