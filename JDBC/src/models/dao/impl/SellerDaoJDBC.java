package models.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import models.dao.SellerDAO;
import models.entities.Department;
import models.entities.Seller;

public class SellerDaoJDBC implements SellerDAO {

  private Connection conn;

  public SellerDaoJDBC(Connection conn) {
    this.conn = conn;
  }

  @Override
  public void deleteById(Integer id) {
    // TODO Auto-generated method stub

  }

  @Override
  public List<Seller> findAll() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Seller findById(Integer id) {
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
      stmt = conn.prepareStatement(
          "SELECT seller.*, department.name as DepName "
              + "FROM seller INNER JOIN department "
              + "ON seller.DepartmentId = department.Id "
              + "WHERE seller.Id = ?");
      stmt.setInt(1, id);
      rs = stmt.executeQuery();
      if (rs.next()) {
        Department dep = instantiateDepartment(rs);

        Seller obj = instantiateSeller(rs, dep);
        return obj;
      }
      return null;
    } catch (SQLException e) {
      throw new DbException(e.getMessage());
    } finally {
      DB.closeStatement(stmt);
      DB.closeResultSet(rs);
    }
  }

  @Override
  public void insert(Seller obj) {
    // TODO Auto-generated method stub

  }

  @Override
  public void update(Seller obj) {
    // TODO Auto-generated method stub

  }

  private Department instantiateDepartment(ResultSet rs) throws SQLException {
    Department dep = new Department();
    dep.setId(rs.getInt("DepartmentId"));
    dep.setName(rs.getString("DepName"));

    return dep;
  }

  private Seller instantiateSeller(ResultSet rs, Department dep) throws SQLException {
    Seller obj = new Seller();
    obj.setId(rs.getInt("Id"));
    obj.setName(rs.getString("Name"));
    obj.setEmail(rs.getString("Email"));
    obj.setBaseSalary(rs.getDouble("BaseSalary"));
    obj.setBirthDate(rs.getDate("BirthDate"));
    obj.setDepartment(dep);
    return obj;
  }

}
