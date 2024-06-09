package models.dao;

public class DAOFactory {
  public static SellerDAO createSellerDAO() {
    return new SellerDAOJDBC();
  }
}
