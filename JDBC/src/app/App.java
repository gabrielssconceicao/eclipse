package app;

import models.dao.DAOFactory;
import models.dao.SellerDAO;
import models.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {

        SellerDAO sellerDAO = DAOFactory.createSellerDAO();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);
    }
}
