package models.dao;

import db.DB;
import models.dao.impl.SellerDaoJDBC;

public class DAOFactory {
  public static SellerDAO createSellerDAO() {
    return new SellerDaoJDBC(DB.getConnection());
  }
}
