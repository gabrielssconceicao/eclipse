package models.dao;

import db.DB;
import models.dao.impl.DepartmentDaoJDBC;
import models.dao.impl.SellerDaoJDBC;

public class DAOFactory {
  public static SellerDAO createSellerDAO() {
    return new SellerDaoJDBC(DB.getConnection());
  }

  public static DepartmentDAO createDepartmentDAO() {
    return new DepartmentDaoJDBC(DB.getConnection());
  }
}
